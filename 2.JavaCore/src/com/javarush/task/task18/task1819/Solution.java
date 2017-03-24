package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        FileInputStream fis1 = new FileInputStream(f1);

        FileInputStream fis = new FileInputStream(f2);


        byte[] bytes = new byte[fis1.available()];
        while (fis1.available() > 0) {
            int count = fis1.read(bytes);

        }
        for (byte x : bytes) {
            System.out.println(x + " 1 ");
        }

        FileOutputStream fos = new FileOutputStream(f1);
        while (fis.available() > 0) {
            fos.write(fis.read());
        }
        fos.write(bytes);

        fis1.close();
        fis.close();
        fos.close();

    }
}
