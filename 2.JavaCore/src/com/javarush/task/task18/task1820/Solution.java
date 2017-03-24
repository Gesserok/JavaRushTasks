package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(f1));


        String doubleInTheFile = reader1.readLine();
        reader1.close();

        String[] stringDoubleArray = doubleInTheFile.split(String.valueOf(' '));
        double[] doubleArray = new double[stringDoubleArray.length];

        for (int i = 0; i < stringDoubleArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringDoubleArray[i]);
        }

        FileOutputStream fos = new FileOutputStream(f2);
        String[] rounded = new String[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            rounded[i] = String.valueOf(round(doubleArray[i], 0));
        }
        StringBuilder roundInTheFile = new StringBuilder();
        for (String x : rounded) {
            roundInTheFile.append(x).append(' ');
        }

        System.out.println(roundInTheFile.toString());
        for (char x : roundInTheFile.toString().toCharArray()) {
            fos.write((byte)x);
        }

        fos.close();

    }

    private static int round(double number, int scale) {
        int pow = 1;
        for (int i = 0; i < scale; i++)
            pow *= 10;
        double tmp = number * pow;
        if (number >= 0) {
            return (int) ((tmp - (int) tmp) >= 0.5d ? tmp + 1 : tmp) / pow;
        } else {
            return (int) ((tmp - (int) tmp) < -0.5d ? tmp - 1 : tmp) / pow;
        }
    }





}
