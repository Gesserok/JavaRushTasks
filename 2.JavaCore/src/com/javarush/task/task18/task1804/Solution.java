package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream fis = new FileInputStream(s);
        long[] bytes = new long[256];
        long min = 0;
        while (fis.available() > 0) {

            int g = fis.read();
            bytes[g]++;
            min = bytes[g];
        }

        fis.close();
        reader.close();
        long m;
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > 0) {
                m = bytes[i];
                if (min > m) {
                    min = m;
                }
            }
        }

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
