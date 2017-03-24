package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file ="";
        HashMap<Integer, byte[]> hashMap = new HashMap<Integer, byte[]>();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        String[] partNFile = new String[1];
        do {

                file = reader.readLine();

            if (!file.equals("end")) {
                fis = new FileInputStream(file);

                byte[] bytes = new byte[fis.available()];
                while (fis.available() > 0) {
                int count = fis.read(bytes);
                partNFile = partN(file);
                hashMap.put(Integer.parseInt(partNFile[1]),bytes);
                }
            }
            fis.close();
        } while (!file.equals("end"));
        fos = new FileOutputStream(partNFile[0]);
        for (Map.Entry<Integer, byte[]> pair : hashMap.entrySet()) {

            fos.write( pair.getValue());

        }
        fos.close();

    }

    public static String[] partN(String file) {
        String[] fileName = file.split(".part");
        return fileName;
    }


}
/*
e:\\1.txt.part1
e:\\1.txt.part5
e:\\1.txt.part3
e:\\1.txt.part2
e:\\1.txt.part4
end
 */