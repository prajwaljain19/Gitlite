package com.gitlite;

import com.gitlite.command.AddCommand;
import com.gitlite.command.InitCommand;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      Welcome to GitLite");
        System.out.println("================================");

        while (true) {

            System.out.print("GitLite > ");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

             String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command.toLowerCase()) {
                case "init" :
                    new InitCommand().execute();
                    break;
                case "add":
                    if(tokens.length < 2) {
                        System.out.println("Usage: add<filename>");
                        break;
                    }
                    new AddCommand().execute(tokens[1]);
                    break;

                default:
                System.out.println("Unknown Command");

            }

        }

        scanner.close();
    }
}