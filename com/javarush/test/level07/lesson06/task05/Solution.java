package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strArr = new ArrayList();
        for(int i = 0; i < 5; i++) strArr.add(input.readLine());
        for(int i = 0; i < 13; i++) {
            strArr.add(0, strArr.get(4));
            strArr.remove(5);
        }
        for(int i = 0; i < strArr.size(); i++) System.out.println(strArr.get(i));
    }
}
