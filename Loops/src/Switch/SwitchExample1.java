package Switch;

import java.util.Random;

public class SwitchExample1 {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is : %d %n" , randomNumber);

        switch (randomNumber){
            case 1:
                System.out.println("You got RED!");
                break;
            case 2:
                System.out.println("You got BLUE!");
                break;
            case 3:
                System.out.println("You got WHITE!");
                break;
            case 4:
                System.out.println("You got PURPLE!");
                break;
            default:
                System.out.println("Better luck next time");
        }
    }
}
