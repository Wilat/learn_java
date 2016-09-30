package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    int name, age;
    String male;
    public Friend(int name) {
        this.name = name;
    }
    public Friend(int name, int age) {
        this.name = name;
        this.age = age;
    }
    public Friend(int name, int age, String male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
}