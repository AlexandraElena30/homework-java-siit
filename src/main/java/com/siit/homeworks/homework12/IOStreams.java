package com.siit.homeworks.homework12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class IOStreams {
    public static void main(String[] args) throws IOException {
        String pathName = "C:\\Users\\Lisse\\Desktop\\Java";

        File[] files;
        System.out.println("\nEx 1. Implement a method to get a list of all file/directory names from the given.");
        files=getFiles(pathName);
        printFiles(files);

        System.out.println("\nEx 2. Implement a method to get specific files by extensions from a specified folder.");
        files = getFilesByExtension(pathName, "txt");
        printFiles(files);

        System.out.println("\nEx 3. Implement a method to check if a file or directory specified by pathname exists or not.");
        if (checkIfExists(pathName)) {
            System.out.println("File/folder " + pathName + " exists");
        } else {
            System.out.println("File/folder " + pathName + " doesn't exist");
        }

        System.out.println("\nEx 4. Implement a method to check if a file or directory has read and write permission.");
        if (checkReadWrite(pathName)) {
            System.out.println("File/folder " + pathName + " is rw");
        } else {
            System.out.println("File/folder " + pathName + " isn't rw");
        }
        printFiles(files);

        System.out.println("\nEx 5. Implement a method to check if given pathname is a directory or a file.");
        System.out.println(checkTheType(pathName));

        System.out.println("\nEx 6. Implement a method to compare two files lexicographically.");
        System.out.println(compareTwoFilesLexico(pathName, pathName));

        System.out.println("\nEx 7. Implement a method to get last modified time of a file.");
        System.out.println(lastModified(pathName));

        System.out.println("\nEx 9. Implement a method to get file size in bytes, kb, mb.");
        System.out.println(getFileSize(pathName + "\\Java_8_in_Action.pdf", "mb"));

        System.out.println("Ex 10. Implement a method to read contents from a file into byte array.");
        System.out.println(Arrays.toString(readBytes(pathName + "\\New Text Document.txt")));

        System.out.println("\nEx 11. Implement a method to read a file content line by line.");
        readLineByLine(pathName + "\\New Text Document.txt");

        System.out.println("\nEx 12.Implement a method to read a plain text file.");
        readPlainText(pathName + "\\New Text Document.txt");

        System.out.println("\nEx 13.Implement a method to read a file line by line and store it into a variable. ");
        System.out.println(readAndStore(pathName + "\\New Text Document.txt"));

        System.out.println("Ex 14. Implement a method to store text file content line by line into an array.");
        for (String s : storeInArray(pathName + "\\New Text Document.txt")) {
            System.out.println(s);
        }

        System.out.println("\nEx 15. Implement a method to read a file line by line and store it into a variable.");
        copyFile(pathName + "\\New Text Document.txt", pathName + "\\New Text Document2.txt");

        System.out.println("\nEx 16. Implement a method to append text to an existing file.");
        appendToOldFile(pathName + "\\New Text Document.txt", "\n==== This is the text added to file ====");

        System.out.println("\nEx 17. Implement a method to read first 3 lines from a file.");
        readThreeLine(pathName + "\\New Text Document.txt");

        System.out.println("\nEx 18. Implement a method to find the longest word in a text file.");
        findLongestWords(pathName + "\\New Text Document.txt");

    }

    public static void printFiles(File[] files) {
        if (files != null)
            for (File file : files) {
                System.out.println(file.getName());
            }
    }

    //1. Implement a method to get a list of all file/directory names from the given.
    public static File[] getFiles(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();


        return listOfFiles;
    }

    //2. Implement a method to get specific files by extensions from a specified folder.
    public static File[] getFilesByExtension(String path, String extension) {
        File folder = new File(path);

        return folder.listFiles((f, name) -> name.toLowerCase().endsWith("." + extension));

    }

    //3. Implement a method to check if a file or directory specified by pathname exists or not.
    public static boolean checkIfExists(String path) {
        File file = new File(path);
        return file.exists();

    }

    //4. Implement a method to check if a file or directory has read and write permission.
    public static boolean checkReadWrite(String path) {
        File file = new File(path);
        return file.canRead() && file.canWrite();
    }

    //5. Implement a method to check if given pathname is a directory or a file.
    public static String checkTheType(String path) {
        File file = new File(path);
        String s = path;
        if (file.isDirectory()) {
            s = s + " is directory";
        } else if (file.isFile()) {
            s = s + " is file";
        } else {
            s = s + " is not a file or a directory";
        }
        return s;
    }

    //6. Implement a method to compare two files lexicographically.
    public static int compareTwoFilesLexico(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        return file1.compareTo(file2);
    }

    //7. Implement a method to get last modified time of a file.
    public static String lastModified(String path) {
        File file = new File(path);
        return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(
                new Date(file.lastModified())
        );
    }
    //8. Implement method to read input from java console.

    //9. Implement a method to get file size in bytes, kb, mb.
    public static long getFileSize(String path, String type) {
        File file = new File(path);
        if (type.equals("b")) {
            return file.length();
        } else if (type.equals("kb")) {
            return file.length() / 1000;
        } else if (type.equals("mb")) {
            return file.length() / 1000000;
        } else {
            return -1;
        }
    }

    //10. Implement a method to read contents from a file into byte array.
    public static byte[] readBytes(String path) throws IOException {
        File file = new File(path);
        return Files.readAllBytes(file.toPath());
    }

    //11. Implement a method to read a file content line by line.
    public static void readLineByLine(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //12. Implement a method to read a plain text file.
    private static void readPlainText(String path) throws IOException {
        String text = Files.readString(Paths.get(path));
        System.out.println(text);
    }

    //13. Implement a method to read a file line by line and store it into a variable.
    public static String readAndStore(String path) {
        String ret = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                ret = ret + line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    //14. Implement a method to store text file content line by line into an array.
    public static ArrayList<String> storeInArray(String path) {
        ArrayList<String> ret = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                ret.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    //15. Implement a method to write and read a plain text file.
    public static void copyFile(String path1, String path2) throws IOException {
        File oldFile = new File(path1);
        File newFile = new File(path2);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(oldFile);
            os = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    //16. Implement a method to append text to an existing file.
    public static void appendToOldFile(String path, String text) {
        File newFile = new File(path);
        try {
            Files.write(newFile.toPath(), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Couldn't append");
        }

    }

    //17. Implement a method to read first 3 lines from a file.
    public static void readThreeLine(String path) throws IOException {
        File newFile = new File(path);
        Files.lines(newFile.toPath()).limit(3).forEach(System.out::println);

    }

    //18. Implement a method to find the longest word in a text file.
    public static void findLongestWords(String path) throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File(path));
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n" + longest_word + "\n");
    }

}
