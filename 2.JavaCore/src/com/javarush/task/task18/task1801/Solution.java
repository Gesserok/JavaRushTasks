package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int max = 0;
        FileInputStream fis = new FileInputStream(file);
        while (fis.available() > 0) {
            int b = fis.read();
            if (max < b) {
                max = b;
            }
        }
        System.out.println(max);





        fis.close();
        reader.close();
    }
}
