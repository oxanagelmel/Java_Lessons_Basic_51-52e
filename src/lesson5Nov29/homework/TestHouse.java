package lesson5Nov29.homework;

import java.util.Scanner;

public class TestHouse {
    public static void main(String[] args) {
        House houseWithOwner = new House(10, 10, 3 , "Petya", "Straße 3");
        House houseWithoutOwner = new House(10, 10, "Straße 4");
        // WICHTIG: записывать каждую строку и все параметры, в том же порядке как и в конструкторе!!!!

        Scanner scanner = new Scanner(System.in);
       // String str1 = scanner.next();
        String str = "text";
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(1, 2));
        //int y = f(x); // y = x + 5 -> f(x) = x + 5   -> y = f(3) -> 3 + 5

        int y = f(9);// возвращает
        build(3, houseWithoutOwner);// ничего не возвращает
        System.out.println(y);
        houseWithOwner.toString();
    }
    public static void build(int high, House house) {

        house.high = high;
    }

    //мат. функция Возвращения
    public static int f (int x) {

        return x + 5;
    }
}
