package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream comp;

    public QuestionFileOutputStream(AmigoOutputStream c) {
        this.comp = c;
    }

    @Override
    public void flush() throws IOException {
        comp.flush();
    }

    @Override
    public void write(int b) throws IOException {
        comp.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        comp.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        comp.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("Д")) {
            comp.close();
        }
        reader.close();
    }
}

