package com.gitlite.command;

import com.gitlite.service.FileService;

public class AddCommand {

    private final FileService fileService;

    public AddCommand() {
        fileService = new FileService();
    }

    public void execute(String fileName) {
        fileService.stageFile(fileName);
    }
}