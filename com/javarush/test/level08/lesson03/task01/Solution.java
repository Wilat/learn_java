package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashSet<String> map = new HashSet<>();
        map.add("арбуз");
        map.add("банан");
        map.add("вишня");
        map.add("груша");
        map.add("дыня");
        map.add("ежевика");
        map.add("жень-шень");
        map.add("земляника");
        map.add("ирис");
        map.add("картофель");

        for(String elem : map) System.out.println(elem);
    }
}
