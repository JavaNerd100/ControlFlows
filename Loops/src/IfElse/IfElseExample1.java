package IfElse;

import java.util.Random;

public class IfElseExample1 {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is : %d %n" , randomNumber);

        boolean expression = randomNumber <= 4 || (randomNumber % 2 == 1);

        if (randomNumber == 3){
            System.out.println("You got RED!");
        }else if (randomNumber >= 2 && (randomNumber % 2 ==0)){
            System.out.println("You got BLUE!");
        }else if ( randomNumber != 4){
            System.out.println("You got WHITE!");
        }else if (expression){
            System.out.println("You got PURPLE!");
        }else {
            System.out.println("Better luck next time");
        }
    }

}