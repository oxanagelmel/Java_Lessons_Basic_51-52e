package lesson8Dez08.homework;

import java.util.Scanner;

//2) напишите программу, которая принимает 1 число - год (можно с помощью Scanner или с помощью Random)
//   и выводит високосный год или нет
public class Task2 {

    int year;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Этот год високосный?");
        Integer year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("да");
        }else {
            System.out.println("нет");
        }
    }
}
