package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();
        FileInputStream fis = new FileInputStream(f2);
        FileOutputStream fos = new FileOutputStream(f1);
        while (fis.available() > 0) {
            fos.write(fis.read());
        }
        fis.close();
        fis = new FileInputStream(f3);
        while (fis.available() > 0) {
            fos.write(fis.read());
        }
        fis.close();
        fos.close();
    }

}
