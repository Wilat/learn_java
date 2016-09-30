package learn.javarush;

import java.io.*;

public class Tasks {
    public static void main(String[] args) throws Exception {
        Cat cat1 = new Cat("Elina Kalimulina", 9, 68, 1002);
        Cat cat2 = new Cat("Alfiya Ardeeva", 9, 60, 1300);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}

class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }
    Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
        return (-(this.age - 5) * (this.age - 5) + 25) * (this.strength - this.weight * 15) > (-(age - 3) * (age - 3) + 9) * (strength - weight * 15);

    }
}
