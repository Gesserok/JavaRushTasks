package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {



    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] personData = line.split(" ");

            return new Person(personData[0], personData[1], personData[3], new Date(Integer.parseInt(personData[6]), Integer.parseInt(personData[5]), Integer.parseInt(personData[4])));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
