package com.javarush.task.task07.task0712;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>(10);
        Scanner scanner = new Scanner(System.in);
        int[] kol = new int[10];
        int min =0;
        int indMax = 0;
        int max = 0;
        int indMin = 0;
        for (int i = 0; i < 10; i++) {
            String line = scanner.next();
            arrayList.add(line);
            if (i == 0) {
                kol[i] = line.length();
                min = kol[i];
                max = kol[i];
            } else {
                kol[i] = line.length();
                if (min > kol[i]) {
                    min = kol[i];
                    indMin = i;
                }
                if (max < kol[i]) {
                    max = kol[i];
                    indMax = i;
                }
            }
        }
        if (indMax < indMin) {
            System.out.println(arrayList.get(indMax));
        }
        else {
            System.out.println(arrayList.get(indMin));
        }



    }
}
