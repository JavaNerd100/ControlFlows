package IfElse;

import java.util.Scanner;

public class IfElseExample2 {

    public static void main(String[] args) {
        String command = null;
        if ("RUN".equals(command)){
            System.out.println("Running now....");
        } else if ("STOP".equals(command)) {
            System.out.println("Stopping now...");
        }
    }
}
