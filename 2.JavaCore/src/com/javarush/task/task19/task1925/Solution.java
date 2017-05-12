package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        int count = 0;
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {

                if (words[i].length() > 6) {
                        if (count!=0) {
                        fileWriter.write(",");
                    }
                    fileWriter.write(words[i]);
                    count++;

                }
            }
        }
        bufferedReader.close();
        fileWriter.close();



    }
}
