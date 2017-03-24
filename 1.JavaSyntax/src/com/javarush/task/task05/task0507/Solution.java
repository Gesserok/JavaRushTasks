package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        int l;
        int summ = 0;
        int i = 0;
        while ((l = scaner.nextInt()) != -1){
            summ = summ + l;
            i++;
        }
        System.out.println((double) summ/i);
    }
}

