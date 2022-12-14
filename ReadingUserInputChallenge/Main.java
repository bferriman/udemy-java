package ReadingUserInputChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numCount = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (numCount < 10) {
            // get a number
            System.out.println("Enter number #" + (numCount + 1) + ":");
            if (scanner.hasNextInt()) {
                numCount++;
                sum += scanner.nextInt();
//                scanner.nextLine();
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of your numbers is: " + sum);

        scanner.close();

    }
}