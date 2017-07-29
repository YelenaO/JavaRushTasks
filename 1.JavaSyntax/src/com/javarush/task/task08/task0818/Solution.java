package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("first", 501);
        map.put("second", 300);
        map.put("third", 45);
        map.put("fourth", 600);
        map.put("fifth", 3000);
        map.put("sixth", 20);
        map.put("seventh", 700);
        map.put("eighth", 501);
        map.put("ninth", 502);
        map.put("tenth", 1);

        return map;//напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        /*HashMap<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            Integer value = pair.getValue();
            if (value <= 500){
                map2.put(pair.getKey(), pair.getValue());
            }
            //либо проверять value > 500 , а после map = map2
        }
        for (Map.Entry<String, Integer> pair : map2.entrySet()) {
            map.remove(pair.getKey());
        }
        //напишите тут ваш код*/

            Iterator iterator = map.entrySet().iterator(); //
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next();
                if ((int)pair.getValue() < 500)
                    iterator.remove();
            }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        //System.out.println(map);

    }
}