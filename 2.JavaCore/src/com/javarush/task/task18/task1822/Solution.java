package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader bis = new BufferedReader(new FileReader(file));
        while (bis.ready()) {
            String line = bis.readLine();
            if (line.contains(args[0].concat(" "))) {
                System.out.println(line);
            }


        }

        bis.close();

    }


}
