package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);

        FileSimbols fs = new FileSimbols();

        while (fis.available() > 0) {
            fs.addAllSimbols();
            if (fis.read() == ' ') {
                fs.addProbel();
            }
        }
        double sootn = (double) fs.getProbel()/(double) fs.allSimbols*(double) 100;
        System.out.println(String.format("%(.2f", round(sootn, 2)));

        fis.close();
    }

    public static class FileSimbols {
        private int allSimbols = 0;
        private int probel = 0;

        public FileSimbols() {

        }

        public int getAllSimbols() {
            return allSimbols;
        }

        public void addAllSimbols() {
            this.allSimbols++;
        }

        public int getProbel() {
            return probel;
        }

        public void addProbel() {
            this.probel++;
        }
    }

    private static double round(double number, int scale) {
        int pow = 10;
        for (int i = 1; i < scale; i++)
            pow *= 10;
        double tmp = number * pow;
        return (double) (int) ((tmp - (int) tmp) >= 0.5d ? tmp + 1 : tmp) / pow;
    }


}
