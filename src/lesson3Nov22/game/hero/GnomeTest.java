package lesson3Nov22.game.hero;

import java.util.Scanner;

public class GnomeTest {
    public static void main(String[] args) {
        Gnome gnomeFirst = new Gnome();
        Gnome gnomeSec = new Gnome();
        gnomeFirst.age = 5;
        gnomeSec.age = 4;
        System.out.println(Constant.GNOME_POWER);// обращение на прямую, зафиксированы
        System.out.println(gnomeFirst.age);// обращаемся к переменной через ссылку
        System.out.println(gnomeSec.age);
        // если меняется значение .age одного из Гномов,
        // на другого это никак не действует

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();//метод - описывает какое-то действие
        // вызов метода происходит через .nextInt(),
        // а в скобках забиваются параметры
    }
}
