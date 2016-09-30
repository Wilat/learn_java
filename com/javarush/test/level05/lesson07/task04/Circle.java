package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    int centerX, centerY;
    double radius, width;
    String color;

    static int STRT_CENTERX = 0, STRT_CENTERY = 0;
    static double STRT_RADIUS = 1.0, STRT_WIDTH = 3.14;
    static String STRT_COLOR = "white";

    public void initialize(int centerX, int centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = STRT_WIDTH;
        this.color = STRT_COLOR;
    }
    public void initialize(int centerX, int centerY, double radius, double width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = STRT_COLOR;
    }
    public void initialize(int centerX, int centerY, double radius, double width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
