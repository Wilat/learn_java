package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date current = new Date(date);
        Date begin = new Date(date);

        begin.setSeconds(0);
        begin.setMinutes(0);
        begin.setHours(0);
        begin.setDate(0);
        begin.setMonth(0);

        return ((current.getTime() - begin.getTime()) / 1000 / 60 / 60 / 24) % 2 == 1;
    }
}
