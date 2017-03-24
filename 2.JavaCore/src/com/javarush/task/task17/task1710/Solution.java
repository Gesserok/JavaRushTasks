package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args[0].equals("-c")) {
            Date birthday = new Date();
            String[] parseDate = args[3].split("/");

            birthday.setDate(Integer.parseInt(parseDate[0]));
            birthday.setMonth(Integer.parseInt(parseDate[1]) - 1);
            birthday.setYear(Integer.parseInt(parseDate[2]) - 1900);


            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], birthday));
            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], birthday));
            }
            System.out.println(allPeople.indexOf(allPeople.get(allPeople.size() - 1)));
        } else if (args[0].equals("-u")) {
            Date birthday = new Date();
            String[] parseDate = args[4].split("/");

            birthday.setDate(Integer.parseInt(parseDate[0]));
            birthday.setMonth(Integer.parseInt(parseDate[1]) - 1);
            birthday.setYear(Integer.parseInt(parseDate[2]) - 1900);
            if (args[3].equals("м")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            } else if (args[3].equals("ж")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(birthday);

        } else if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
        } else if (args[0].equals("-i")) {

            Person info = allPeople.get(Integer.parseInt(args[1]));
            if (info.getSex()==Sex.MALE) {
                System.out.println(info.getName() + " м " + dateFormat.format(info.getBirthDay()));
            }
            else if (info.getSex()==Sex.FEMALE)
            System.out.println(info.getName()  + " ж "  + dateFormat.format(info.getBirthDay()));
        }

    }



}
// -i — выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)