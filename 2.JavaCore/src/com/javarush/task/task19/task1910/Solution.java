package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()){
            String k = reader.readLine();
            String[] kmas = k.split("[\\p{P} \\t\\n\\r]");
            for (String mm : kmas) {
                writer.write(mm);
            }
        }

        reader.close();
        writer.close();



    }
}
