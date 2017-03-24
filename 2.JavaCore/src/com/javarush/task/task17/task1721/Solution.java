package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
            BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    public void joinData () throws CorruptedDataException {





    }
}
