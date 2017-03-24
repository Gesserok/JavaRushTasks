package com.javarush.task.task17.task1711;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        parseArguments(args);
    }

//    public static synchronized void addPeople(String[] args){
//        for (int i = 1; i<args.length; i=i+3) {
//            allPeople.add(Per);
//        }
//
//    }
//
//    public static synchronized Person personCreate(String[] args){
//        return Person.createFemale(args[0]);
//    }

    public static ArrayList<String[]> parseArguments(String[] args) {
        ArrayList<String[]> pars = new ArrayList<String[]>();
        switch (args[0]) {
            case ("-c"):
                for (int i = 1; i < args.length; i = i + 3) {// = i + 3) {
                        pars.add(new String[]{args[0], args[i], args[i + 1], args[i + 2]});
                }

//                for (String[] x : pars) {
//                    for (String y : x) {
//                        System.out.println(y);
//                    }
//                }

            case ("-u"):

            case ("-d"):
            case ("-i"):

        }


        return pars;
    }
}
