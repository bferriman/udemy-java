package CharSwitchChallenge;

public class Main {

    public static void main(String[] args) {
        char switchLetter = 'E';

        switch(switchLetter) {
            case 'A':
                System.out.println("It's an 'A'...");
                break;

            case 'B':
                System.out.println("It's a 'B'...");
                break;

            case 'C':
                System.out.println("It's a 'C'...HOO-ray...");
                break;

            case 'D':
                System.out.println("It's a 'D'.  'D' for donkey.");
                break;

            case 'E':
                System.out.println("Look everyone.  It's an 'E'.  How wonderful.");
                break;

            default:
                System.out.println("Didn't find any of those letters.  I guess there must be others.");
                break;
        }
    }
}