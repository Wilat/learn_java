package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()), b = Integer.parseInt(input.readLine());
        if (a < b) b = a;
        System.out.println(b);

    }
}