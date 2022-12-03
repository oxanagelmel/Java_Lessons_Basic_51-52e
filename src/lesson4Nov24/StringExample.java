package lesson4Nov24;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String st = new String("test"); // создание через конструктор
        String str = "test"; // создание через литерал
        //Нумерация начинается с нуля! 0 = t, 1 = e, 2 = s, 3 = t -> это элементы
        System.out.println(str);
        System.out.println(str.length());  // возвращает длину строки = 4
        System.out.println("Wow! " + str); // складывать строки
        System.out.println(str.charAt(1)); // найти элемент на позиции индекса = e
        System.out.println(str.indexOf('t'));
        System.out.println(str.lastIndexOf('t'));
        System.out.println(str.indexOf("st"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 3));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('t', 'v'));

        Scanner scanner = new Scanner(System.in);
        String readVal = scanner.nextLine();
        System.out.println(readVal);

    }
}
