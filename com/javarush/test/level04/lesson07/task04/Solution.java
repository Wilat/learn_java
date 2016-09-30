package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()), b = Integer.parseInt(input.readLine()), c = Integer.parseInt(input.readLine());
        int posit = 0, negat = 0;
        if (a < 0) negat++; else if (a > 0) posit++;
        if (b < 0) negat++; else if (b > 0) posit++;
        if (c < 0) negat++; else if (c > 0) posit++;
        System.out.println("количество отрицательных чисел: " + negat + "\nколичество положительных чисел: " + posit);
    }
}
