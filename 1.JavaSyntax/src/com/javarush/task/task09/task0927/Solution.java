package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("A", new Cat("A"));
        map.put("B", new Cat("B"));
        map.put("C", new Cat("C"));
        map.put("D", new Cat("D"));
        map.put("E", new Cat("E"));
        map.put("F", new Cat("F"));
        map.put("G", new Cat("G"));
        map.put("H", new Cat("H"));
        map.put("I", new Cat("I"));
        map.put("J", new Cat("J"));

        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet set = new HashSet<Cat>();
        for (Map.Entry pair: map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
