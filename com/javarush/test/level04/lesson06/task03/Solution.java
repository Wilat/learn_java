package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()), b = Integer.parseInt(input.readLine()), c = Integer.parseInt(input.readLine());
        if (a < b)
            if (a < c) {
                if(b > c) System.out.println(b + "\n" + c);
                else System.out.println(c + "\n" + b);
                System.out.println(a);
            } else System.out.println(b + "\n" + a + "\n" + c);
        else
            if (a > c) {
                System.out.println(a);
                if(b > c) System.out.println(b + "\n" + c);
                else System.out.println(c + "\n" + b);
            } else System.out.println(c + "\n" + a + "\n" + b);
    }
}
