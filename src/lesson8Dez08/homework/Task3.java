package lesson8Dez08.homework;

import lesson0.Main;

import java.util.Scanner;

//3) Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
//   Напишите программу которая спрашивает у покупателя сколько он хочет купить печенья, после этого с помощью Scanner
//   считывается число сколько печенья хочет купить покупатель, после спрашивается сколько денег у покупателя
//   и считывается число (сколько денег у покупателя), программа должна написать может ли купить столько печенья
//   за такие деньги, например
//   покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
//   покупатель хочет купить 12 печенек, у него 8 евро ответ  можно
public class Task3 {

    public static void main(String[] args) {
        double price = 0.5;
        int howMuchCookies = 10;
        int money = 4;

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele möchten Sie kaufen?");
        int howManyCookies = scanner.nextInt();

        System.out.println("Wie viel haben Sie dabei?");
        int howManyMoney = scanner.nextInt();
      */

        if(price * howMuchCookies <= money){
            System.out.println("möglich");
        }else {
            System.out.println("nicht möglich");
        }
    }
}
