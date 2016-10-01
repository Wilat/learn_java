package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    int name, age;
    String male;
    public void initialize(int name) {
        this.name = name;
    }
    public void initialize(int name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(int name, int age, String male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
}
