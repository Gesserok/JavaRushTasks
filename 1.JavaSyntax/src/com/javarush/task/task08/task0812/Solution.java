package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }

        int count = 1;
        int max = 1;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) == arrayList.get(i + 1)) {
                count++;
                if (max < count)
                    max = count;
            } else
                count = 1;
        }
        System.out.println(max);
    }

}

