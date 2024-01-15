package Switch;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your command");
        String userCommand =scanner.nextLine();
        System.out.printf("Your command --> %s%n",userCommand);


        switch (userCommand){
            case "GO":
                System.out.println("Running now....");
                break;
            case "STOP":
                System.out.println("Stopping now....");
                break;
            default:
                System.out.println("Command not understood...");

        }

    }
}
