package com.gitlite.command;
import com.gitlite.service.RepositoryService;


public class InitCommand implements  Command {

    private final RepositoryService repositoryService;

    public InitCommand() {
        repositoryService = new RepositoryService();
    }
    @Override
    public void execute() {
        repositoryService.initializeRepository();
    }

}