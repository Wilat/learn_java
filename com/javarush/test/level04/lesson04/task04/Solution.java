package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        //::CODE:
        String s;
        switch(mount) {
            case 1: case 2: case 12: s = "зима"; break;
            case 4: case 5: case 3: s = "весна"; break;
            case 7: case 8: case 6: s = "лето"; break;
            case 10: case 11: case 9: s = "осень"; break;
            default: s = "такого месяца нет"; break;
        }
        System.out.println(s);
    }
}