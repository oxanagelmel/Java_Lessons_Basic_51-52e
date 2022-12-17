package lesson9Dez13.homework9.FirstLevel;

import java.util.Random;

//1) В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
//   Пользователь вводит номер квартиры. Программа должна указать в каком подъезде находится данная квартира.
public class Task1 {
    public static int MAX_ENTRANCES = 4;
    public static int firstEntrance = 1 - 20;
    public static int secondEntrance = 11 - 48;
    public static int thirdEntrance = 49 - 90;

    public static void main(String[] args) {
        Random random = new Random();
        boolean firstEntrance = random.nextBoolean();
        boolean secondEntrance = random.nextBoolean();
        boolean thirdEntrance = random.nextBoolean();
        int apartment = random.nextInt(19);
        System.out.printf("первый подъезд %s второй подъезд %s третий подъезд %s\n",firstEntrance, secondEntrance, thirdEntrance, apartment);
    }
}
