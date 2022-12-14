package SumDigitsChallenge;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits 123 is " + sumDigits(123));
        System.out.println("The sum of the digits 9876 is " + sumDigits(9876));
        System.out.println("-10 should return -1: " + sumDigits(-10));
        System.out.println("For some reason single digits are Not OK, so the sum of 8 is " + sumDigits(8));

        System.out.println("Trying to mod a negative number: -5 % 10 = " + (-5 % 10));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}