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
                    if (!String.valueOf(buffer).startsWith(sb.toString())) {
                        charList.add(buffer);
                        System.out.println(buffer);
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
                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\12.txt"), "Unicode");
                boolean st = false;
                while (inputStreamReader.ready()) {
                    int count = inputStreamReader.read(buffer);
                    if (!String.valueOf(buffer).startsWith(sb)) {
                        osw.write(buffer);
                    } else {
                        int i;
                        int j =8;
                        for (i = 0; i < args[2].toCharArray().length; i++) {
                            buffer[j] = args[2].toCharArray()[i];
                            j++;
                        }
                        if (j !=37 ) {
                            for (j = j; j < 38; j++) {
                                buffer[j] = ' ';
                            }
                        }
                        for (i = 0; i < args[3].toCharArray().length; i++) {
                            buffer[j] = args[3].toCharArray()[i];
                            j++;
                        }
                            if (j != 45) {
                                for (j = j; j < 46; j++) {
                                    buffer[j] = ' ';
                                }
                            }


                        for (i = 0; i < args[4].toCharArray().length; i++) {
                            buffer[j] = args[4].toCharArray()[i];
                                j++;
                            }
                            if (j != 49) {
                                for (j = j; j < 50; j++) {
                                    buffer[j] = ' ';
                                }
                            }



                        osw.write(buffer);

                    }

                }
                inputStreamReader.close();
                osw.close();

                InputStreamReader copyStream = new InputStreamReader(new FileInputStream("E:\\12.txt"), "Unicode");
                OutputStreamWriter copyOsw = new OutputStreamWriter(new FileOutputStream(file), "Unicode");

                while (copyStream.ready()) {
                    int count = copyStream.read(buffer);
                        copyOsw.write(buffer);
                }
                copyStream.close();
                copyOsw.close();

            }
        }

        File fileName = new File("E:\\12.txt");
        if (fileName.exists()) {
            fileName.delete();
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

