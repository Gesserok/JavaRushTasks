package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReade = new BufferedReader(new FileReader(args[0]));
        while (bufferedReade.ready()) {
            String line = bufferedReade.readLine();
            String[] personData = line.split(" ");
            int year = Integer.parseInt(personData[personData.length-1]);
            int month = Integer.parseInt(personData[personData.length-2]);
            String sDay = personData[personData.length-3];
            int day = Integer.parseInt(sDay);

            String name = line.substring(0, line.indexOf(String.valueOf(" ".concat(sDay))));
            Date date = new Date(year-1900, month-1, day);




            Person person = new Person(name.toString(), date);
            PEOPLE.add(person);
        }
        bufferedReade.close();



    }
}
