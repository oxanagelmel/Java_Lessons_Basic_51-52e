package lesson6Dez01;

//4) напишите класс с методами для конвертации градусы цельсия в фаренгейты
//   и метод для конвертации фаренгейтов в цельсия
//   (Фаренгейт — 32) : 1,8 = Цельсий   Пример: (50°F - 32) : 1,8 = 10°C
//   Цельсий х 1,8 + 32 = Фаренгейт     Пример: 10°C x 1,8 + 32 = 50°F
//5) напишите метод для получения суммы трех чисел

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        FarnheitCoverter farnheitCoverter = new FarnheitCoverter();
        System.out.println(farnheitCoverter.fromCelsius(10));
        System.out.println(farnheitCoverter.toCelcius(50));
    }

    static int calc3Numb() {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        return one + two + three;
    }
    //oder einfacher geschrieben:
 //  static int calc3Numb(int one, int two, int three) {
 //       return one + two + three;
 //   }
}
