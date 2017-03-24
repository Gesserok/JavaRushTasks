package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(str1);
        FileOutputStream file2 = new FileOutputStream(str2);
        FileOutputStream file3 = new FileOutputStream(str3);
        while (file1.available() > 0) {
            byte[] buff = new byte[file1.available()];
            int count = file1.read(buff);
            if (count%2==0) {
                file2.write(buff, 0, count/2);
                file3.write(buff, count/2, count/2);
            }
            else if (count%2!=0){
                file2.write(buff, 0, (count/2)+1);
                file3.write(buff, (count/2)+1, count-((count/2)+1));
            }
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
/*

E:\\Recovery.txt
E:\\1.txt
E:\\2.txt


if (fis.available()< (int)(allBytes/2) ) {
        fos = new FileOutputStream(f2);
        fos.write(bytes, 0, allBytes/2);
        System.out.println("f2");
        } else {
        fos = new FileOutputStream(f3);
        fos.write(bytes, allBytes/2, allBytes/2+1);
        System.out.println("f3");
        }
*/