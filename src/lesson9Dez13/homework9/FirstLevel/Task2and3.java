package lesson9Dez13.homework9.FirstLevel;

//2) Переменная num может принимать 4 значения: 1, 2, 3 или 4. Если она имеет значение '1',
//   то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее.
//   Решите задачу через switch-case.

import java.util.Random;
import java.util.Scanner;

public class Task2and3 {

    public static void main(String[] args) {
      //  Random random = new Random();
      //  int result = random.nextInt();
        String num = String.valueOf("3");

        switch (num) {
            case "1":
                System.out.println("Зима");
                break;
            case "2":
                System.out.println("Весна");
                break;
            case "3":
                System.out.println("Лето");
                break;
            case "4":
                System.out.println("Осень");
                break;

        }
//3) В переменной month лежит какое-то число из интервала от 1 до 12.
//   Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
        int month = 1 - 12;
        switch (month) {
            case 12, 1, 2:
                System.out.println("Зима");
            case 3, 4, 5:
                System.out.println("Весна");
            case 6, 7, 8:
                System.out.println("Лето");
            case 9, 10, 11:
                System.out.println("Осень");
        }
    }
}
