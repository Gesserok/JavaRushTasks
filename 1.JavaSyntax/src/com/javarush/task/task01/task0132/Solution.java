package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        char[] arr = String.valueOf(number).toCharArray();
        int s = 0;
        for (char x : arr){
            s = s + Integer.parseInt(String.valueOf(x));
        }
        return s;
    }
}