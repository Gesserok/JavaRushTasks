package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];

        FileInputStream fis = new FileInputStream(fileName);

        TreeMap<Character, Integer> map = new TreeMap<>();


        while (fis.available() > 0) {
            int line = fis.read();
            if (!map.containsKey((char)line)) {
                map.put((char) line, 1);
            } else {
                map.put((char)line, map.get((char)line) + 1);
            }
        }
        fis.close();
//        for (int i = 32; i < 123; i++) {
//            if (charAscii[i] > 0) {
//                System.out.println((char) (i) + " " + charAscii[i]);
//            }
//        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }



    }

}
