package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) throws IOException {

        String file = "1.txt";

        char[] chars = new char[0];
        int[] intsLine = new int[0];

//        FileWriter fw = new FileWriter(file, true);

        OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(file, true), "Unicode");

        int[] id = new int[8];
        StringBuilder sb = new StringBuilder();
        if (args[0].equals("-d")) {
            for (int i = 0; i < id.length; i++) {
                if (i < args[1].toCharArray().length) {
                    char[] idChars = args[1].toCharArray();
                    id[i] = (int) ((args[1].toCharArray())[i]);
                } else  {
                    id[i] = 32;
                }
            }
        }

        for (int x : id) {
             sb.append((char)x);
        }

        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] idFromFile = new int[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Unicode"));
        while (reader.ready()) {
            String line = reader.readLine();
            idFromFile = new int[line.length()];
            if (!line.isEmpty()) {
                chars = line.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    idFromFile[i] = (int)chars[i];
                }
                if (line.startsWith(sb.toString())) {
                    System.out.println("OK");
                } else {
                    arrayList.add(idFromFile);
                }
            }
        }
        reader.close();
        for (int[] x : arrayList) {
            for (int y : x) {
                System.out.println((char)y);
                fw.write((char)y);
            }
        }
        fw.close();
        fw.close();











    }
}



/*



        String file = "E:\\1.txt";

        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();

        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "Unicode");
        while (isr.ready()) {
            int count = isr.read();
            ib.put(count);
        }
        ib.flip();
        while (ib.hasRemaining()) {
            System.out.println(ib.get());
        }

*/