package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);
        byte key = 1;
        if (args[0].equals("-e")) {

            while (fis.available() > 0) {
                int count = fis.read();
                fos.write(count+key);
            }
            fis.close();
            fos.close();

        }
        else if (args[0].equals("-d")) {
            while (fis.available() > 0) {
                int count = fis.read();
                fos.write(count-key);
            }
            fis.close();
            fos.close();
        }

    }


}
