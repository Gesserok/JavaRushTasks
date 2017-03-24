package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("1", 100);
        hashMap.put("2", 200);
        hashMap.put("3", 1000);
        hashMap.put("4", 700);
        hashMap.put("5", 100);
        hashMap.put("6", 600);
        hashMap.put("7", 1000);
        hashMap.put("8", 1500);
        hashMap.put("9", 300);
        hashMap.put("10", 900);
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        for(Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}