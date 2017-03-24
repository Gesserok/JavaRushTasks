package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static int count = 0;
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        while (fis.available() > 0) {
            char ch = (char) fis.read();
            if (((Character) ch).toString().matches(("^[a-zA-Z]"))) {
                count++;
            }
        }
        fis.close();
        System.out.println(count);
    }

}
