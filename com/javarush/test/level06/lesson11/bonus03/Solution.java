package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine()), d = Integer.parseInt(reader.readLine()), e = Integer.parseInt(reader.readLine());
        boolean t;
        do {
            t = false;
            int tmp = Integer.MIN_VALUE;
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            }
            if (c > d) {
                tmp = c;
                c = d;
                d = tmp;
            }
            if (d > e) {
                tmp = d;
                d = e;
                e = tmp;
            }
            if (tmp != Integer.MIN_VALUE) t = true;
        } while (t);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}