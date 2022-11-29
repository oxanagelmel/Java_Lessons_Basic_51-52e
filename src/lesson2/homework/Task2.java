package lesson2.homework;

public class Task2 {
    public static void main(String[] args) {
        //2. Дано трехзначное число. Вывести на экран все цифры этого числа
        int num = 123;

        int hundreds = num / 100;
        int dec = (num % 100) / 10;
        int n = num % 10;

        System.out.println(num);
        System.out.println(hundreds);
        System.out.println(dec);
        System.out.println(n);
    }
}
