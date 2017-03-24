package com.javarush.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-огород
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit) { //добавляет параметр fruit в лист fruits на позицию index
            fruits.add(index, fruit);
        }
        public synchronized void removeFruit(int index) { // удаляет из fruits элемент с индексом index
            fruits.remove(index);
        }

        public synchronized void addVegetable(int index, String vegetable) { //добавляет в vegetables элемент с индексом index
            vegetables.add(index, vegetable);
        }
        public synchronized void removeVegetable(int index) { //remove
            vegetables.remove(index);
        }

    }
}
