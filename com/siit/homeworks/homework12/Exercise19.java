package com.siit.homeworks.homework12;

//19. Implement a terminal (cmd) in Java using IO operations.
//Your app should replicate at least 5 commands and a help command (exclusive) that shows the available commands.
//Commands are given in the console (including the options for that command) and result of the command should also
// be displayed in the console or a feedback message.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) throws IOException {

        File currentDirectory = new File("C:\\Users\\Lisse\\IdeaProjects\\homework\\src\\main\\java\\homework12");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String[] arrOfStr;
        String input;
        while (!exit) {
            input = scanner.nextLine();
            arrOfStr = input.split("\\s+");
            if (arrOfStr[0].equals("exit")) {
                exit = true;
            } else if (arrOfStr.length == 1 && arrOfStr[0].equals("ls")) {
                getFiles(currentDirectory, "");
            } else if (arrOfStr.length == 2 && arrOfStr[0].equals("ls")) {
                getFiles(currentDirectory, arrOfStr[1]);
            } else if (arrOfStr.length == 1 && arrOfStr[0].equals("cd")) {
                currentDirectory = changeDirectory(currentDirectory, "");
            } else if (arrOfStr.length == 2 && arrOfStr[0].equals("cd")) {
                currentDirectory = changeDirectory(currentDirectory, arrOfStr[1]);
            } else if (arrOfStr.length == 2 && arrOfStr[0].equals("mkdir")) {
                createDirectory(currentDirectory, arrOfStr[1]);
            } else if (arrOfStr.length == 2 && arrOfStr[0].equals("del")) {
                deleteFile(currentDirectory, arrOfStr[1]);
            } else if (arrOfStr.length == 3 && arrOfStr[0].equals("cp")) {
                copyFile(currentDirectory, arrOfStr[1], arrOfStr[2]);
            } else if (arrOfStr.length == 1 && arrOfStr[0].equals("help")) {
                helpCommand();
            } else
                System.out.println("Invalid input");
        }
    }


    //1. Implement a method to get a list of all file/directory names from the given.
    public static void getFiles(File path, String newPath) {

        File[] listOfFiles;

        if (newPath.equals("")) {
            listOfFiles = path.listFiles();
            if (listOfFiles != null)
                for (File file : listOfFiles) {
                    System.out.println(file.getName());
                }
        } else if (newPath.charAt(0) >= 65 && newPath.charAt(0) <= 90 && newPath.charAt(1) == 58) {
            File newFile = new File(newPath);
            if (newFile.isDirectory()) {
                listOfFiles = newFile.listFiles();
                if (listOfFiles != null)
                    for (File file : listOfFiles) {
                        System.out.println(file.getName());
                    }
            }
        } else {
            File newFile = new File(path.getAbsolutePath() + "\\" + newPath);
            if (newFile.isDirectory()) {
                listOfFiles = newFile.listFiles();
                if (listOfFiles != null)
                    for (File file : listOfFiles) {
                        System.out.println(file.getName());
                    }
            }
        }
    }

    public static File changeDirectory(File path, String newPath) {


        if (newPath.equals("")) {
            System.out.println(path.getAbsolutePath());
            return path;
        } else if (newPath.charAt(0) >= 65 && newPath.charAt(0) <= 90 && newPath.charAt(1) == 58) {
            File newFile = new File(newPath);
            if (newFile.isDirectory()) {
                return newFile;
            }
        } else {
            File newFile = new File(path.getAbsolutePath() + "\\" + newPath);
            if (newFile.isDirectory()) {
                return newFile;
            }
        }
        return path;
    }


    public static void createDirectory(File path, String newPath) {

        if (newPath.charAt(0) >= 65 && newPath.charAt(0) <= 90 && newPath.charAt(1) == 58) {
            File newFile = new File(newPath);
            if (newFile.mkdir()) {
                System.out.println("Directory is created");
            } else {
                System.out.println("Directory cannot be created");
            }
        } else {
            File newFile = new File(path.getAbsolutePath() + "\\" + newPath);
            if (newFile.mkdir()) {
                System.out.println("Directory is created");
            } else {
                System.out.println("Directory cannot be created");
            }
        }
    }

    public static void deleteFile(File directoryToBeDeleted, String newPath) {
        File newFile;
        if (newPath.charAt(0) >= 65 && newPath.charAt(0) <= 90 && newPath.charAt(1) == 58) {
            newFile = new File(newPath);
        } else {
            newFile = new File(directoryToBeDeleted.getAbsolutePath() + "\\" + newPath);
        }

        if (newFile.isDirectory()) {
            File[] allContents = newFile.listFiles();
            if (allContents != null) {
                for (File file : allContents) {
                    deleteFile(file, "");
                }
            }
        }
        newFile.delete();
    }


    public static void copyFile(File directory, String oldPath, String newPath) throws IOException {
        File newFile;
        if (newPath.charAt(0) >= 65 && newPath.charAt(0) <= 90 && newPath.charAt(1) == 58) {
            newFile = new File(newPath);
        } else {
            newFile = new File(directory.getAbsolutePath() + "\\" + newPath);
        }
        File oldFile;
        if (oldPath.charAt(0) >= 65 && oldPath.charAt(0) <= 90 && oldPath.charAt(1) == 58) {
            oldFile = new File(oldPath);
        } else {
            oldFile = new File(directory.getAbsolutePath() + "\\" + oldPath);
        }

        if (!newFile.exists()) {
            newFile.createNewFile();
        }

        Files.copy(oldFile.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void helpCommand(){
        System.out.println("The following commands are available: ");
        System.out.println("ls [path]  - prints files in current/given folder");
        System.out.println("cd [path]  - prints current path/if argument given moves to specified folder");
        System.out.println("mkdir folderName - makes a new directory with the given folderName");
        System.out.println("del file - deletes the specified file/folder");
        System.out.println("cp file1 file2 - copies file1 to file2, if there is no file2 a new one is created");
        System.out.println("exit - closes terminal");

    }

}
