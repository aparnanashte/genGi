package com.bug.api;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {
    public static List<String> findJavaFiles(String directoryPath) {
        List<String> javaFiles = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            traverseDirectory(directory, javaFiles);
        }
        return javaFiles;
    }

    private static void traverseDirectory(File directory, List<String> javaFiles) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    traverseDirectory(file, javaFiles); // Recursive call for subdirectories
                } else if (file.isFile() && file.getName().endsWith(".java")) {
                    javaFiles.add(file.getAbsolutePath());
                }
            }
        }
    }
}
