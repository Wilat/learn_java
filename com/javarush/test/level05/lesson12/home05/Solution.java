package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception{
        //напишите тут ваш код
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int sum = 0;
        do {
            String inputString = input.readLine();
            if (inputString.equals("сумма")) break;
            sum += Integer.parseInt(inputString);
        } while (true);
        System.out.println(sum);
    }
}
