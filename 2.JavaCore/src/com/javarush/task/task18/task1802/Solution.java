package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fis = new FileInputStream(file);
        int min = fis.read();
        while (fis.available() > 0) {

            int b = fis.read();

            if (b < min) {
                min = b;
            }

        }
        System.out.println(min);
        fis.close();
        reader.close();
    }
}
