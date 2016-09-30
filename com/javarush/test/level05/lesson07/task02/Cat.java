package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    int weight, age;
    String name, color, address;

    static int STRT_WEIGHT = 3, STRT_AGE = 5;
    static String STRT_COLOR = "gray";

    public void initialize(String name) {
        this.name = name;
        this.weight = STRT_WEIGHT;
        this.age = STRT_AGE;
        this.color = STRT_COLOR;
        this.name = null;
        this.address = null;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = STRT_COLOR;
        this.address = null;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.weight = STRT_WEIGHT;
        this.age = age;
        this.color = STRT_COLOR;
        this.address = null;
    }
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.address = null;
        this.name = null;
        this.age = STRT_AGE;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = STRT_AGE;
        this.name = null;
    }
}
