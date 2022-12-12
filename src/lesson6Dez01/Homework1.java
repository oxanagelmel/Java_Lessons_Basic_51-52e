package lesson6Dez01;

import java.util.Scanner;

import static java.lang.String.join;

/*        First level:
        1) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину
        2) Написать метод который будет возвращать результат склейки двух строк.
        3) создайте 5 методов с разной сигнатурой, но с одинаковым названием метода

        перегрузка = overload - overriding
*/

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Выведи длину слова: "); //не обязательно тут
        String str = scanner.nextLine();
        System.out.println(str.length()); // str.length() =  метод

        System.out.println(concat("I love ", "Java"));
    }
    public static String concat(String first, String second){
        return first + second;
    }

    public static void jump() {

    }

    public static void jump(int high) {

    }

    public static void jump(short way) {

    }
    public static void jump(long day) {

    }
    public void jump(int high, short way) {

    }
}
