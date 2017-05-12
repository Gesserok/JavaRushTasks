package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);
        int count=0;

        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(" ");

            for (String x : words) {
                char[] c = x.toCharArray();
                for (char ch : c) {
                    if ((String.valueOf(ch).matches("\\d"))) {
                        System.out.println(ch + " - " + (byte)ch);
                        if (count!=0) {
                            fw.write(" ");

                        }
                        fw.write(x);
                        count++;
                        break;
                    }
                }

            }

        }
        reader.close();
        fw.close();

    }
}
