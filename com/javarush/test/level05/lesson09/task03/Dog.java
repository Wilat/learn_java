package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    int height;
    String name, color;

    static int STRT_HEIGHT = 1;
    static String STRT_COLOR = "black";

    public Dog(String name) {
        this.name = name;
        this.height = STRT_HEIGHT;
        this.color = STRT_COLOR;
    }
    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
        this.color = STRT_COLOR;
    }
    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
