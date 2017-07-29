package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String s = n.readLine();
        /*DateFormat formatS = new SimpleDateFormat("MM/dd/yyy");
        Date date;
        date = formatS.parse(s);
        System.out.println(date);
        DateFormat format = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);

        System.out.println(format.format(date)); код работает, но не принимает валидацию
        */
        Date date = new Date(s);
        SimpleDateFormat format = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
        System.out.println(format.format(date).toUpperCase());

        //напишите тут ваш код
    }
}
