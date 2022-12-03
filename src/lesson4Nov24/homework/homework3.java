package lesson4Nov24.homework;
//1 Создайте строку I love Java Lessons!
//2 Распечатать первый символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли строка подстроку “love”. Используем метод String.contains().
//5 Заменить все символы “o” на “a”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Lessons c помощью метода String.substring().
//
//10 программу для подсчета какой индекс у символа 'L'
//11 Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner
//   и после пишет на консоль “Hello …….. ! - вместо многоточий имя
//12 Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner
//   и после пишет "Ваше имя начинается с буквы …"
//13 имеется число 59.976, нужно вывести целое из него и перевести в int (явное преобразование типов)
//14 перевести число 475 типа int в short

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
       /* String str = "I love Java Lessons!";
        System.out.println(str.charAt(0));
       // System.out.println(str.contains());
        System.out.println(str.replace('o', 'a'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(12, 19));
        System.out.println(str.indexOf('L'));*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String Val = scan.nextLine();
        String name = "Oxana";
        System.out.println("Hello " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String readVal = scanner.nextLine();
        String n = "Lena";
        System.out.println("Ваше имя начинаемся с буквы " + n.charAt(0));

    }
}
