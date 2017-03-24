package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file ="";
        do {
            file = reader.readLine();
            if (!file.equals("exit")) {
                ReadThread thread = new ReadThread(file);
                thread.start();
            }
        } while (!file.equals("exit"));

        reader.close();

        for (Map.Entry<String, Integer> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            resultMap.put(fileName, maxCountByte(fileName));
        }

        private static int maxCountByte (String file) throws IOException {
            byte[] bytes = new byte[256];

            FileInputStream fis = new FileInputStream(file);
            while (fis.available() > 0) {
                int count = fis.read();
                bytes[count] ++;
            }
            fis.close();
            return maxArr(bytes);

        }

        private static int maxArr(byte[] arr) {
            int max = arr[0];
            int j=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    j = i;
                }
            }
            return j;
        }


        // implement file reading here - реализуйте чтение из файла тут
    }
}
