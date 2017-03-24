package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<LineClass> prodact = new ArrayList<LineClass>();
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            prodact.add(new LineClass(line));
        }

        FileWriter fw = new FileWriter(fileName, true);


        fw.close();
    }

    public static class LineClass {
        private String id;
        private String productName;
        private String price;
        private String quantity;

        private byte[] idB = new byte[8];
        private byte[] productNameB = new byte[60];


        public LineClass(String line) {
            char[] lineToChar = line.toCharArray();
            setId(idFromLine(lineToChar));
            setProductName(idFromLine(lineToChar));
            setPrice(idFromLine(lineToChar));
            setQuantity(idFromLine(lineToChar));
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        private String idFromLine(char[] idChar) {
            StringBuilder lineID = null;
            for (int i = 0; i < 8; i++) {
                lineID = lineID.append(idChar[i]);
            }
            return new String(lineID);
        }

        private String productNameFromLine(char[] idChar) {
            StringBuilder lineID = null;
            for (int i = 8; i < 38; i++) {
                lineID = lineID.append(idChar[i]);
            }
            return new String(lineID);
        }

        private String priceFromLine(char[] idChar) {
            StringBuilder lineID = null;
            for (int i = 38; i < 46; i++) {
                lineID = lineID.append(idChar[i]);
            }
            return new String(lineID);
        }

        private String quantityFromLine(char[] idChar) {
            StringBuilder lineID = null;
            for (int i = 46; i < 50; i++) {
                lineID = lineID.append(idChar[i]);
            }
            return new String(lineID);
        }
    }

    public static String maxID(ArrayList<LineClass> lineClasses) {
        int maxIDid =0;
        for (LineClass x : lineClasses) {
            if (Integer.parseInt(x.getId()) > maxIDid) {
                maxIDid = Integer.parseInt(x.getId());
            }
        }
        return String.valueOf(maxIDid);
    }



}

//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        reader.close();
//        ArrayList<String> strList = br("E:\\1.txt");
//        long maxID = 0;
//        long id;
//        for (String x : strList) {
//            if (!x.isEmpty()) {
//               id = id(x);
//                if (id > maxID) {
//                    maxID = id;
//                }
//            }
//        }
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
//        bw.newLine();
//        bw.write(String.valueOf(maxID+1) + " " + String.valueOf(args[1]) + " " + String.valueOf(args[2])  + " " +  String.valueOf(args[3]));
//        bw.close();
//
//    }
//
//    public static ArrayList<String> br(String file) throws IOException {
//        ArrayList<String> strList = new ArrayList<String>();
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            strList.add(line);
//        }
//        bufferedReader.close();
//        return strList;
//    }
//
//    public static long id(String line) {
//        int count = 0;
//        char[] lineChar = line.toCharArray();
//        byte[] byteChar = new byte[lineChar.length];
//
//        for (int i = 0; i < lineChar.length; i++) {
//            byteChar[i] = (byte) lineChar[i];
//        }
//        for (byte x : byteChar) {
//            if (x >= 48 && x <= 57) {
//                count++;
//            } else {
//                break;
//            }
//        }
//        return Long.parseLong(line.substring(0, count));
//    }

        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = "";

        long maxID = 0;
        long id;
        String idLine="";



        if (args[0].equals("-c")) {
            while ((line = bufferedReader.readLine()) != null) {
                int count =0;
                char[] lineChar = line.toCharArray();
                byte[] byteChar = new byte[lineChar.length];

                for (int i = 0; i < lineChar.length; i++) {
                    byteChar[i] = (byte)lineChar[i];
                }

                for (byte x : byteChar) {
                    if (x>=48 && x<=57) {
                        count++;
                    }
                    else {
                        break;
                    }
                }

                idLine = line.substring(0, count);
                id = Long.parseLong(idLine);
                if (id > maxID) {
                    maxID = id;
                }
            }
            bufferedReader.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(String.format("&id &productName &price &quantity", maxID+1, args[1], args[2], args[3]));
            bw.close();
        }*/

