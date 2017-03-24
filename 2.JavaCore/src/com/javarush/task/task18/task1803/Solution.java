package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream fis = new FileInputStream(file);

        long[] bytes = new long[256];
        long max = 0;
        long m = 0;

        while (fis.available() > 0) {
            int b = fis.read();
            bytes[b]++;
            m = bytes[b];
            if (max < m) {
                max = m;
            }

        }
        fis.close();
        reader.close();

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == max) {
                System.out.print(i + " ");
            }
        }

    }
}
