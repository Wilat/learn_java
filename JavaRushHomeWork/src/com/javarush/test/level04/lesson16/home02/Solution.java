package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()), b = Integer.parseInt(input.readLine()), c = Integer.parseInt(input.readLine());
        System.out.println(average(a, b, c));
    }

    private static int average(int a, int b, int c) {
        if (a > b) if (b > c) return b; else if (a > c) return c; else return a;
        if (a > c) return a; else if (b > c) return c; else return b;
    }
}
