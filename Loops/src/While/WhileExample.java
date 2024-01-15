package While;

import java.util.Random;
import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {


        int randomNum = new Random().nextInt(10) +1;

        String userGuessedInput = null;


     // String userGuessedInput = System.console().readLine("Please select a number between 1 to 10 inclusively: ");
     // int guessedNum = Integer.parseInt(userGuessedInput);

        while (!"Guess".equals(userGuessedInput)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select a number between 1 to 10 inclusively: ");
            userGuessedInput = scanner.nextLine();
            int guessedNum = 0;
            if (userGuessedInput.matches("-?\\d{1,2}"))
                guessedNum = Integer.parseInt(userGuessedInput);
                if (guessedNum == randomNum) {
                    System.out.printf("The random number was %d. You got it%n", randomNum);
                    break;
                } else {
                    System.out.printf("The random number was %d. You didn't get it%n ", randomNum);
                }
        }
    }
}


