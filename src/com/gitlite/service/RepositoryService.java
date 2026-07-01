package com.gitlite.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RepositoryService {
    public void initializeRepository() {
        try {
            Path repositoryPath = Paths.get(".gitlite");

            if(Files.exists(repositoryPath)) {
                System.out.println("Repository already exists.");
                return;
            }
            Files.createDirectories(repositoryPath);

            Files.createDirectories(repositoryPath.resolve("commits"));
            Files.createDirectories(repositoryPath.resolve("objects"));
            Files.createDirectories(repositoryPath.resolve("staging"));

            Files.createFile(repositoryPath.resolve("HEAD"));
            System.out.println("Repository initialized successfully.");

        } catch (IOException e) {
            System.out.println("Error while creating repository.");
            e.printStackTrace();
        }

    }
}
