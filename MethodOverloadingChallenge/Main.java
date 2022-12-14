package MethodOverloadingChallenge;

public class Main {
    public static void main(String[] args) {
        double numCM2 = calcFeetAndInchesToCentimeters(74.5);
        System.out.println("74.5 in = " + numCM2 + "cm");
        double numCM1 = calcFeetAndInchesToCentimeters(5, 7);
        System.out.println("5 ft 7 in = " + numCM1 + "cm");
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) {
            return -1;
        }
        if (inches < 0 || inches >= 12) {
            return -1;
        }
        double totalInches = feet * 12 + inches;
        return calcFeetAndInchesToCentimeters(totalInches);
    }
}