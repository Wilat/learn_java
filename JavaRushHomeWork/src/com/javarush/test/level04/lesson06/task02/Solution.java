package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    private static int max(int a, int b) { return a > b ? a : b; }
    private static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()), b = Integer.parseInt(input.readLine()), c = Integer.parseInt(input.readLine()), d = Integer.parseInt(input.readLine());
        System.out.println(max(a, b, c, d));
    }
}
