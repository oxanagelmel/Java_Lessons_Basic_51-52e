package lesson6Dez01;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
    public static void main(String[] args) {
    /*    Scanner scanner = new Scanner(System.in);   //запуск с разными числами
        System.out.println("Введите первое число ");
        int first = scanner.nextInt();                //число здесь самим придумываешь
        System.out.println("Введите второе число ");  //какое нужно сложить
        int second = scanner.nextInt();
    */
        //сделать так что бы число из головы брал сам комп а не я
        //сгенирировать рандомное/случайное число
        Random random = new Random();
        int first = random.nextInt(-50, 50); //первое число генерирует число от 0 до 100
        int second = random.nextInt(100); //если не записать 100 второе от -2милд до +2милд во всём промежутке int-a
        //число сто не включается

        random.nextDouble(); //[0,1]
        random.nextDouble(10); //[0,10]
        random.nextDouble(-10, 10); //[-10,10]

        Math.random();
        ThreadLocalRandom.current().nextInt();//испольсуется в разработке где есть бороба за ресурсы
        //когда есть бороба за ресурсы одновременно работает 2 программы и взвается random
        //в этом случае random может вернуть одинаковое значение
        //а ThreadLocalRandom в действительности возвращает разное, не опирается на системное время и генерирует уникальное число
        //при этом в компе всё это работает псевдорандомно

        int sum = first + second;
        System.out.println(first + " прибавить " + second + " равно " + sum);
    }
}
