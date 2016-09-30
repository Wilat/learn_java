package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = new String[10];

        for(int i = 0; i < 8; i++) strArr[i] = input.readLine();
        for(int i = 0; i < 5; i++) {
            String tmp = strArr[i];
            strArr[i] = strArr[9 - i];
            strArr[9 - i] = tmp;
        }
        for(int i = 0; i < 10; i++) System.out.println(strArr[i]);
    }
}