package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        StringBuilder sb = new StringBuilder();

        while (bufferedReader.ready()) {
            String count = bufferedReader.readLine();
            String[] strCount = count.split(" ");

            for (String x : strCount) {
                Integer i = null;
                try {
                    i = Integer.parseInt(x);
                } catch (NumberFormatException e) {
                }
                if (i!=null) {
                    System.out.println(i);
                    sb.append(String.valueOf(i).concat(" "));
                }

            }
        }
        sb.deleteCharAt(sb.lastIndexOf(" "));
        bufferedWriter.write(sb.toString());
        bufferedReader.close();
        fileReader.close();
        bufferedWriter.close();

    }
}
