package com.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class DataScienceJavaR {
    public static void main(String[] args) {
        String inputDir = "data/input";
        String outputDir = "data/output";
        
        try {
            Files.createDirectories(Paths.get(outputDir));
            
            // Read the data
            List<String> lines = Files.readAllLines(Paths.get(inputDir, "data.csv"));
            
            // Process the data (for example, let's just print it)
            for (String line : lines) {
                System.out.println(line);
            }

            // Create a command to call R script
            String command = "Rscript scripts/analyze.R " + inputDir + "/data.csv " + outputDir + "/results.png";
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();

            System.out.println("R script executed successfully.");
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
