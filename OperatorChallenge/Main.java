package OperatorChallenge;

public class Main {

    public static void main(String[] args) {
        
        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double result = (firstNumber + secondNumber) * 100;
        double remainder = result % 40.00d;
        boolean isDivisibleByForty = remainder == 0;
        System.out.println("isDivisibleByForty is " + isDivisibleByForty);
        if (!isDivisibleByForty) {
            System.out.println("Got some remainder");
        }
    }
}