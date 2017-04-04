package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) throws IOException {

        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine();
        if (!(args.length == 0)) {
            char[] idInFile = new char[52];
            ArrayList<String> arrayList = new ArrayList<String>();
            String id = args[1];
            while (id.length() < 8) {
                id = id.concat(" ");
            }

            InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "Unicode");


            if (args[0].equals("-d")) {
                while (isr.ready()) {
                    int count = isr.read(idInFile);
                    String lineInFile = String.copyValueOf(idInFile);

                    if (!lineInFile.startsWith(id)) {
                        arrayList.add(lineInFile);
                    }
                }
                isr.close();
                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName), "Unicode");
                for (String x : arrayList) {
                    osw.write(x);
                }
                osw.close();
            }



            if (args[0].equals("-u")) {

                String productName = args[2];
                while (productName.length() < 30) {
                    productName = productName.concat(" ");
                }

                String price = args[3];
                while (price.length() < 8) {
                    price = price.concat(" ");
                }

                String quantity = args[4];
                while (quantity.length() < 4) {
                    quantity = quantity.concat(" ");
                }


                while (isr.ready()) {
                    int count = isr.read(idInFile);
                    String lineInFile = String.copyValueOf(idInFile);

                    if (!lineInFile.startsWith(id)) {
                        arrayList.add(lineInFile);
                    } else {
                        arrayList.add(id.concat(productName).concat(price).concat(quantity));
                    }
                }
                isr.close();
                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName), "Unicode");
                for (String x : arrayList) {

                    if (x.startsWith(id)) {
                        osw.write(x);
                        osw.append((char) 13);
                        osw.append((char) 10);
                    } else {
                        osw.write(x);
                    }
                }
                osw.close();
            }
        }
    }

}