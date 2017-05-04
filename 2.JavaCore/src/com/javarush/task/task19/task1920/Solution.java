package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        TreeMap<String, Double> modifiedList = new TreeMap<String, Double>();
            String fileName = args[0];
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                line = line.replaceAll("\\p{Cntrl}", "");
                arrayList.add(line.split(" "));
            }
            bufferedReader.close();
            for (String[] x : arrayList) {
                if (modifiedList.isEmpty()) {
                    modifiedList.put(x[0], Double.parseDouble(x[1]));
                } else {
                    if (!modifiedList.containsKey(x[0])) {
                        modifiedList.put(x[0], Double.parseDouble(x[1]));
                    } else {
                        modifiedList.replace(x[0], Double.parseDouble(x[1]) + modifiedList.get(x[0]));
                    }
                }
            }
            double max = modifiedList.lastEntry().getValue();

            for (Map.Entry<String, Double> pair : modifiedList.entrySet()) {
                if (pair.getValue()>max) {
                    max = pair.getValue();
                }
            }
        for (Map.Entry<String, Double> pair : modifiedList.entrySet()) {
            if (pair.getValue()==max) {
                System.out.println(pair.getKey());
            }
        }

        }

}
