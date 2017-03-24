package com.javarush.task.task07.task0706;

import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[15];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        int chent = 0;
        int nechet = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i%2==0){
                chent = chent + ints[i];
            }
            else {
                nechet = nechet + ints[i];
            }
        }

        if (chent>nechet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (chent<nechet) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else if (chent==nechet) {
            System.out.println("В домах с нечетными и четными номерами проживает равное количество жителей.");
        }

    }
}
