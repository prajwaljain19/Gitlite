package com.gitlite;

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

            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (command.equalsIgnoreCase("init")) {

                InitCommand initCommand = new InitCommand();
                initCommand.execute();

            } else {

                System.out.println("Unknown Command");

            }

        }

        scanner.close();
    }
}