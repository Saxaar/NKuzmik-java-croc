package ru.croc.task8;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        getWordCount(args[0]);
       /* System.out.println();
        getWordCount("c:/Users/kuzmi/Desktop/File.txt");*/
    }

        public static void getWordCount(String filename) throws FileNotFoundException{
            File file = new File(filename);
            int count = 0;
            try(Scanner sc = new Scanner(new FileInputStream(file))) {

                while (sc.hasNext()) {
                    sc.next();
                    count++;
                }
            }
            System.out.println("count : "+count);
        }
}



