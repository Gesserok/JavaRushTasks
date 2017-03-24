package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        FileInputStream fis = null;
        String str = "";
        File file = null;
        while (true) {

            reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                str = reader.readLine();
                file = new File(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis =  new FileInputStream(file);
            } catch (FileNotFoundException e) {
                System.out.println(file);
                break;
            } finally {
                    try {
                        fis.close();
                    } catch (NullPointerException e) {
                        break;
                    }

            }
            fis.close();
        }
    }
}