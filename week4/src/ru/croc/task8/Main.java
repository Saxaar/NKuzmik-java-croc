package ru.croc.task8;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        getWordCount("c:/Users/kuzmi/Desktop/File.txt");
    }


        public static void getWordCount(String filename) throws FileNotFoundException{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int words = 0;
            int lines = 0;

            while (scanner.hasNextLine()) {
                lines++;
                String[] array = scanner.nextLine().split(" ");
                words = words + array.length;
            }

            System.out.println("Number of words: " + words);
            System.out.println("Number of lines: " + lines);
            scanner.close();
        }
}



