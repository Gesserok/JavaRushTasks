package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++ ){
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        even = 0;
        odd = 0;
        for (int i=0; i < ints.length; i++) {
            if (ints[i]%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);

     }
}
