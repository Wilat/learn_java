package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    double left, top, width, height;

    static double STRT_LEFT = 0, STRT_TOP = 0, STRT_WIDTH = 0, STRT_HEIGHT = 0;

    public Rectangle(double left, double top, double width, double height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(double left, double top) {
        this.left = left;
        this.top = top;
        this.width = STRT_WIDTH;
        this.height = STRT_HEIGHT;
    }
    public Rectangle(double left, double top, double width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle old) {
        this.left = old.left;
        this.top = old.top;
        this.width = old.width;
        this.height = old.height;
    }
}
