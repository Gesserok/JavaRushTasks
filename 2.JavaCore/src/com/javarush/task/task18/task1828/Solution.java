package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static ArrayList<String> stringList = new ArrayList<String>();
    public static ArrayList<char[]> charList = new ArrayList<char[]>();
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();



        if (!(args.length == 0)) {
            if (args[0].equals("-d")) {

                String sb = argsParse(args);
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "Unicode");
                char[] buffer = new char[52];

                while (inputStreamReader.ready()) {
                    int count = inputStreamReader.read(buffer);
                    char[] bf = buffer.clone();
                    if (!String.valueOf(buffer).startsWith(sb.toString())) {
                        charList.add(bf);
                        System.out.println(bf);
                    }
                }

                inputStreamReader.close();

                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "Unicode");
                for (char[] x : charList) {
                    osw.write(x);
                    System.out.println(x);
                }

                osw.close();



            }
            if (args[0].equals("-u")) {

                String sb = argsParse(args);

                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "Unicode");
                char[] buffer = new char[52];
                boolean st = false;
                while (inputStreamReader.ready()) {
                    int count = inputStreamReader.read(buffer);
                    char[] bf = buffer.clone();
                    if (!String.valueOf(buffer).startsWith(sb)) {
                        charList.add(bf);
                    } else {
                        int i;
                        int j =8;
                        for (i = 0; i < args[2].toCharArray().length; i++) {
                            bf[j] = args[2].toCharArray()[i];
                            j++;
                        }
                        if (j !=37 ) {
                            for (j = j; j < 38; j++) {
                                bf[j] = ' ';
                            }
                        }
                        for (i = 0; i < args[3].toCharArray().length; i++) {
                            bf[j] = args[3].toCharArray()[i];
                            j++;
                        }
                        if (j != 45) {
                            for (j = j; j < 46; j++) {
                                bf[j] = ' ';
                            }
                        }


                        for (i = 0; i < args[4].toCharArray().length; i++) {
                            bf[j] = args[4].toCharArray()[i];
                            j++;
                        }
                        if (j != 49) {
                            for (j = j; j < 50; j++) {
                                bf[j] = ' ';
                            }
                        }



                        charList.add(bf);

                    }

                }
                inputStreamReader.close();

                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "Unicode");
                for (char[] x : charList) {
                    osw.write(x);
                    System.out.println(x);
                }

                osw.close();

            }
        }


    }

    public static String argsParse (String[] args) {
        StringBuilder sb = new StringBuilder();
        if (!(args.length == 0)) {

            char[] chars = new char[0];
            int[] intsLine = new int[0];
            int[] id = new int[8];

            for (int i = 0; i < id.length; i++) {
                if (i < args[1].toCharArray().length) {
                    char[] idChars = args[1].toCharArray();
                    id[i] = (int) ((args[1].toCharArray())[i]);
                } else {
                    id[i] = 32;
                }
            }


            for (int x : id) {
                sb.append((char) x);
            }
        }
        return sb.toString();
    }
}

