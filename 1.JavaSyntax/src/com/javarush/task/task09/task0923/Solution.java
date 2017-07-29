package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String line = n.readLine();
        char[] array = line.toCharArray();

        ArrayList<Character> listVowels = new ArrayList<>();
        ArrayList<Character> listConsonant = new ArrayList<>();

        for(char x:array) {
            if (isVowel(x)) {
                listVowels.add(x);
                }
            else listConsonant.add(x);
        }
        for (int i = 0; i < listVowels.size(); i++){
            System.out.print(listVowels.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < listConsonant.size(); i++){
            if (listConsonant.get(i) != ' ') {
                System.out.print(listConsonant.get(i) + " ");
            }
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}