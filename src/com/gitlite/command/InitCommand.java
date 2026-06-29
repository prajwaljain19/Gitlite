package com.gitlite.command;

public class InitCommand implements  Command {
    @Override
    public void execute() {
        System.out.println("Executing Init Command");
    }
}