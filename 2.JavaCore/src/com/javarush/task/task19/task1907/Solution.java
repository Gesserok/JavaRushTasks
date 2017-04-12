package com.javarush.task.task19.task1907;

/*
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        bufferedReader.close();

        FileReader reader = new FileReader(file);


        StringBuilder sb = new StringBuilder();
        int counter =0;
        while (reader.ready()) {
            int count = reader.read();
            sb.append((char) count);
        }
        reader.close();

        String strFile = sb.toString();
        String[] masStr = strFile.split("[\\p{P} \\t\\n\\r]");
        for (String x : masStr) {


            if (x.equals("word")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}