package lesson8Dez08.homework;

import java.util.Scanner;

//1) С консоли вводится число - возраст человека
//   после чего вызывается метод, который возвращает ответ можно ли этому человеку смотреть фильм, у фильма ограничение
//   по возрасту не меньше 18.
// Пример:
//   на входе число 19 пишется Можно идти смотреть кино
//   на входе число 7 пишется Нельзя идти смотреть кино

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean calcAge = false;
        System.out.println(calcAge);
    }

    public int calcAge(int age) {
        if (age > 18) {
            System.out.println("Можно идти смотреть кино!");
        } else if (age == 18) {
            System.out.println("Можно идти смотреть кино!");
        } else {
            System.out.println("Нельзя идти смотреть кино!");
    }

    public static boolean age18OrNot(int calcAge) {
        return (age);
    }
}
