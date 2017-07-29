package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        ArrayList<Integer> list = new ArrayList<>();
        for (; ; ) {
            try {
                BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

                String p = null;
                try {
                    p = n.readLine();
                } catch (IOException e) {

                }
                int k = Integer.parseInt(p);
                list.add(k);

            } catch (NumberFormatException e) {
                for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));
                break;
            }
        }
    }

    //напишите тут ваш код
}

