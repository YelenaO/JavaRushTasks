package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        int max = 1;

        for (int i = 0; i < 10; i++){
            String s = n.readLine();
            int k = Integer.parseInt(s);
            list.add(k);
        }

        for (int i = 1; i < list.size(); i++){
            if (list.get(i-1).equals(list.get(i))){
                count++;

            }
            else {
                if (max < count){
                    max = count;
                }
                count = 1;
                }
        }

        System.out.println(max);

  //напишите тут ваш код

    }
}