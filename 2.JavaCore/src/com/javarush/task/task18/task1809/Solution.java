package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1 = reader.readLine();
        String f2 = reader.readLine();

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        byte[] buffer = new byte[fis.available()];
        while (fis.available() > 0) {
            int count = fis.read(buffer);
        }

        for (int i = buffer.length-1; i >=0; i--) {
            fos.write(buffer[i]);
        }

        fis.close();
        fos.close();

    }
}
