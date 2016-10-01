package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg0 = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Protos protos0 = new Protos();
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Terran terran0 = new Terran();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        zerg1.name = "0";
        zerg2.name = "9";
        zerg3.name = "8";
        zerg4.name = "7";
        zerg5.name = "6";
        zerg6.name = "5";
        zerg7.name = "4";
        zerg8.name = "3";
        zerg9.name = "2";
        zerg0.name = "1";
        protos0.name = "g";
        protos1.name = "f";
        protos2.name = "d";
        protos3.name = "s";
        protos4.name = "a";
        terran11.name = "za";
        terran10.name = "sx";
        terran9.name = "cd";
        terran8.name = "fv";
        terran7.name = "bg";
        terran6.name = "hn";
        terran5.name = "mj";
        terran4.name = "k,";
        terran3.name = ".l";
        terran2.name = ";/";
        terran1.name = "'";
        terran0.name = "";
    }
    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}