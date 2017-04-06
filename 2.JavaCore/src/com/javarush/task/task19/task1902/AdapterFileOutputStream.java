package com.javarush.task.task19.task1902;

/* 
Адаптер
*/

import java.io.*;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream = null;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream){
        this.fileOutputStream = fileOutputStream;
    }


    public static void main(String[] args) {

    }


    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void writeString(String s) throws IOException {

        char[] chars = s.toCharArray();
        byte[] buffer = new byte[chars.length];

        for (int i = 0; i < chars.length; i++) {
            buffer[i] = (byte)chars[i];
        }


        fileOutputStream.write(buffer);
    }

    public void close() throws IOException {
        fileOutputStream.close();
    }
}

