package For;

import java.util.Random;
import java.util.Scanner;

public class ForExample {
    private static final int MAX_ALLOWED_GUESSES = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) +1;

        String userGuessedInput = null;
        int wrongGuessedCount = 1;


        // String userGuessedInput = System.console().readLine("Please select a number between 1 to 10 inclusively: ");
        // int guessedNum = Integer.parseInt(userGuessedInput);

        for (;wrongGuessedCount<=MAX_ALLOWED_GUESSES;wrongGuessedCount++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select a number between 1 to 10 inclusively: ");
            userGuessedInput = scanner.nextLine();
            int guessedNum = 0;
            if (userGuessedInput.matches("-?\\d{1,2}"))
                guessedNum = Integer.parseInt(userGuessedInput);
            if (guessedNum == randomNum) {
                String tryText = wrongGuessedCount == 1 ? "try" : "tries";
                System.out.printf("The random number was %d. You got it in %d %s %n", randomNum,wrongGuessedCount,tryText);
                break;
            } else {
                System.out.printf(" You didn't get it%n ", randomNum);
            }
        }

        if (wrongGuessedCount >= MAX_ALLOWED_GUESSES){
            System.out.printf("You've had %d incorrect guesses.The random number was %d.Ending program now.....",wrongGuessedCount - 1,randomNum);
        }

    }

}

