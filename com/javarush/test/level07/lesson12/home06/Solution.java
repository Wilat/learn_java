package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human fatherDad = new Human(), fatherMom = new Human(), motherDad = new Human(), motherMom = new Human(), dad = new Human(), mom = new Human(), childOne = new Human(), childTwo = new Human(), childThree = new Human();
        fatherDad.name = "Владислав"; fatherDad.age = 50; fatherDad.sex = true;
        fatherMom.name = "Рината"; fatherMom.age = 53; fatherMom.sex = false;
        motherDad.name = "Алексей"; motherDad.age = 54; motherDad.sex = true;
        motherMom.name = "Катя"; motherMom.age = 48; motherMom.sex = false;
        dad.name = "Ирек"; dad.age = 36; dad.sex = true; dad.father = fatherDad; dad.mother = motherDad;
        mom.name = "Алина"; mom.age = 33; mom.sex = false; mom.father = fatherMom; dad.mother = motherMom;
        childOne.name = "Элина"; childOne.age = 18; childOne.sex = false; childOne.father = dad; childOne.mother = mom;
        childTwo.name = "Амир"; childTwo.age = 16; childTwo.sex = true; childTwo.father = dad; childTwo.mother = mom;
        childThree.name = "Альфия"; childThree.age = 14; childThree.sex = false; childThree.father = dad; childThree.mother = mom;
        System.out.println(fatherDad);
        System.out.println(fatherMom);
        System.out.println(motherDad);
        System.out.println(motherMom);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father, mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
