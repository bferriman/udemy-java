package MethodChallenge;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[] {1500, 900, 400, 50};
        String[] names = new String[] {"Jimbo", "Jacko", "Jeffers", "Jorb"};

        for (int i = 0; i < numbers.length; i++) {
            displayHighScorePosition(names[i], calculateHighScorePosition(numbers[i]));
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        }
        if (score >= 500){
            return 2;
        }
        if (score >= 100){
            return 3;
        }
        return 4;
    }
}