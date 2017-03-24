package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream fis = new FileInputStream(s);
        long[] bytes = new long[256];
        while (fis.available() > 0) {

            int g = fis.read();
            if (bytes[g] == 0) {
                bytes[g]++;
            }
        }
        fis.close();
        reader.close();

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 1) System.out.print(i + " ");
        }
    }
}
