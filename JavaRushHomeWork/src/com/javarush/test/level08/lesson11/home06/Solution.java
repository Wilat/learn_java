package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandMaF = new Human("nameMF", 32, true), grandMaM = new Human("nameMM", 93, false),
                grandPaF = new Human("namePF", 99, true), grandPaM = new Human("namePM", 45, false),
                father = new Human("nameF", 16, true), mother = new Human("nameM", 18, false),
                son = new Human("nameS", 2, true),
                eldestDaughter = new Human("nameED", 4, false), youngerDaughter = new Human("nameYD", 0, false);
        grandMaF.children.add(mother); grandMaM.children.add(mother);
        grandPaF.children.add(father); grandPaM.children.add(father);
        mother.children.add(son); father.children.add(son);
        mother.children.add(eldestDaughter); father.children.add(eldestDaughter);
        mother.children.add(youngerDaughter); father.children.add(youngerDaughter);
        System.out.println(grandPaF);
        System.out.println(grandPaM);
        System.out.println(grandMaF);
        System.out.println(grandMaM);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(eldestDaughter);
        System.out.println(son);
        System.out.println(youngerDaughter);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            children = new ArrayList<>();
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
