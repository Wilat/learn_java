package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()), b = Integer.parseInt(input.readLine()), c = Integer.parseInt(input.readLine());
        int posit = 0;
        if (a > 0) posit++;
        if (b > 0) posit++;
        if (c > 0) posit++;
        System.out.println(posit);
    }
}
