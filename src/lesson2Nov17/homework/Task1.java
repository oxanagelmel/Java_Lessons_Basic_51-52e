package lesson2Nov17.homework;

public class Task1 {
    public static void main(String[] args) {
        //1. В методе main инициализировать все примитивные типы и вывести их в консоль
        //    Результат:
        //    char: G
        //    integer: 89
        //    byte: 4
        //    short: 56
        //    float: 4.7333436
        //    double: 4.355453532
        //    long: 12121

        char c = 'G';
        int num = 89;
        byte b = 4;
        short s = 56;
        float f = 4.7333436f;
        double d = 4.355453532;
        long l = 12121L;

        System.out.println("char: " + c);
        System.out.println("integer: " + num);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}
