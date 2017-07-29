package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String city = reader.readLine();

            addresses.put(family, city);
        }
        Set<Map.Entry<String, String>> entrySet=addresses.entrySet();

        //read home number
        String houseCity = reader.readLine();
        for(Map.Entry<String, String> pair : entrySet){
            if(houseCity.equals(pair.getKey())) {
                String familySecondName = pair.getValue();
                System.out.println(familySecondName);
            }
        }

    }
}
/*
HashMap<String,Object> map=new HashMap<String,Object>();
Set<Map.Entry<String,Object>> entrySet=map.entrySet();

Object desiredObject=new Object();//что хотим найти
for (Map.Entry<String,Object> pair : entrySet) {
    if (desiredObject.equals(pair.getValue())) {
        return pair.getKey();// нашли наше значение и возвращаем  ключ
    }
}
 */

