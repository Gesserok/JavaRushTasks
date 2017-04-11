package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            int count = reader.read();
            if ((int)('.') != count) {
                sb.append((char)count);
            } else {
                sb.append('!');
            }
        }
        reader.close();
        writer.write(sb.toString());
        writer.close();

    }
}
