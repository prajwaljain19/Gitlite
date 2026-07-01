package com.gitlite.service;

import java.io.IOException;
import java.nio.file.*;

public class FileService {
    public void stageFile(String fileName) {
        Path source = Paths.get(fileName);
        Path destinnation = Paths.get(".gitlite", "staging", fileName);
        System.out.println(source.toAbsolutePath());

        try {
            if(!Files.exists(source)) {
                System.out.println("File does not exist.");
                return;
            }
            Files.copy(source, destinnation, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File added to staging successfully.");
        } catch (IOException e) {
            System.out.println("Error while staging file.");
            e.printStackTrace();
        }
    }
}
