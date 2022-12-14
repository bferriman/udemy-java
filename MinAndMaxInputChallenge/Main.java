package MinAndMaxInputChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = -1;
        int max = -1;
        boolean valuesInitialized = false;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // get a number
            System.out.println("Enter a number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (!valuesInitialized) {
                    min = number;
                    max = number;
                    valuesInitialized = true;
                } else {
                    if (number > max) { max = number; }
                    if (number < min) { min = number; }
                }
            } else {
                System.out.println("Exiting...");
                break;
            }
            scanner.nextLine();
        }

        if (!valuesInitialized) {
            System.out.println("No valid input was received.");
        } else {
            System.out.println("The min number is: " + min);
            System.out.println("The max number is: " + max);
        }

        scanner.close();

    }
}