package lesson2Nov17.homework;

public class Task3 {
    public static void main(String[] args) {
        /*3. Напишите программу, которая выводит на экран значение переменной типа инт в квадрате (n* n).
        Предварительно обьявите эту переменную и задайте ее значение.
        Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
        Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Распечатайте её через println.
        Сколько программа отбросила в дробной части?*/

        int n = 6;
        int square = n * n;
        System.out.println(square);

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int sum = a + b + c + d + e + f + g + h + i + j;
        int average = sum / 10;     //(a + b + c + d + e + f + g + h + i + j) / 10
        int mod = sum % average;

        System.out.println(average);
        System.out.println(mod);
    }
}
