package learn.javarush;

public class All {
    public static void main(String args[]) throws java.io.IOException {
        //int, char, double, boolean, String
        //FileInputStream, FileOutputStream; .read, .write, .close
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); String name = reader.readLine();
        //^Need throws java.io.IOException
        //class: public, ?final?
        //class = new Class
        //static variable - exists while exists class?; static may change, but allow all objects of class if one static;
        //static method - cannot use class variables
        //method: private, public, protected, default=package
        //Сложные типы присваиваются по ссылкам!
        //static variables exists all time?
        //Как используется void?
        //java.util - ArrayList; java.lang - autoImport
        //use package.package.class||import package.package; use class
        //class.toString()_
        //Type.parseType();
        //compare objects (not links!): object1.equals(object2);
        //finalize; calls not ever... Java call finalizel finalize - method before destroy object;
        //all classes is childs of Object;
        //сновной смысл модификатора static перед объявлением класса - это регулирование отношения класса Cat к классу StaticClassExample. Смысл примерно такой: класс Cat не привязан к объектам класса StaticClassExample, и не может обращаться к обычным (нестатическим) переменным класса StaticClassExample.
        //- Значит, я могу создавать классы внутри других классов?
        //- Да. Java такое позволяет.
        //private static var; --> not this.var, but class.var;
        //ArrayList<type> var = new ArrayList() = new ArrayList<>(); ~ <=> type
        //ArrayList.add(index, value);
        //ArrayList.remove(index);
        //ArrayList<int> ==> ERROR; ArrayList<Integer> = true;
        //Collections.addAll(ArrayList, values,,,); ArrayList.addAll(ArrayList);
        //for(int x : array)
        //Thread.sleep(ms);
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("test\nstring");
        Tmp a = new Tmp(), b;
        a.a = 2;
        b = a;
        a.a = Integer.parseInt(input.readLine());
        if (a.a % 3 == 0) {
            System.out.print("!!!");
        } else {
            System.out.print("???");
        }
        System.out.print(b.a);
        b = new Tmp(102);
        System.out.println("\n" + a.a + " " + b.a);
        swap(a, b);
        TmpOld c = new TmpOld();
        c.b = 111;
        System.out.println(a.a + " " + b.a + "\n" + b.toString() + " " + c.toString());
        double whileVar = 10000;
        while (whileVar > 0) {
            whileVar--;
            for (;true;) {
                if (true) break;
            }
        }
    }

    private static void swap(Tmp a, Tmp b) {
        Tmp c = new Tmp();
        c.a = a.a;
        a.a = b.a;
        b.a = c.a;
    }
}

class TmpOld {
    int b;
}

class Tmp {
    int a;
    static double PI = 3.14;
    Tmp() {}
    Tmp(int a) {
        this.a = a;
    }
    public String toString() {
        String PI = "PI";
        return "Tmp@a=" + a + ";" + PI + ":" + Tmp.PI;
    }
    private static void ErrorStatic() {
        //int b = a;        //ERROR
        //int a = this.a;   //ERROR
        double PI = Tmp.PI;
    }
}