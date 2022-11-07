package PrimitiveTypesChallenge;

public class Main {

    public static void main(String[] args) {
        byte myByte = 100;
        short myShort = 31415;
        int myInt = 1234567890;

        long answer = (long) 10 * (myByte + myShort + myInt) + 50000;

        System.out.println("The answer is: " + answer);

    }
}