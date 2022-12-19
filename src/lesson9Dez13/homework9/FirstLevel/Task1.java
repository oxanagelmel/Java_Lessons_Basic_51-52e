package lesson9Dez13.homework9.FirstLevel;

import java.util.Random;

//1) В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
//   Пользователь вводит номер квартиры. Программа должна указать в каком подъезде находится данная квартира.

/*Teacher's comment: пересмотри занятие с if/else
первый номер не правильно
что-то типа такого должно быть:
if ( number <= 20) {
            System.out.println(" Подъезд + 1");
        }
        else if ( number <= 48) {
            System.out.println(" Подъезд + 2");
        } else if (number <= 90) {
            System.out.println(" Подъезд + 3 ");
        }

 */
public class Task1 {
    /* не правильно
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
        System.out.printf("первый подъезд %s второй подъезд %s третий подъезд %s\n", firstEntrance, secondEntrance, thirdEntrance, apartment);
    }*/
    public static void main(String[] args) {
        int number = -20;
        if ( number <= 0) {
            System.out.println("Такой квартиры не существует!");
        } else if ( number <= 20) {
            System.out.println("Подъезд + 1");
        } else if ( number <= 48) {
            System.out.println("Подъезд + 2");
        } else if (number <= 90) {
            System.out.println("Подъезд + 3 ");
        } else {
            System.out.println("Не в этом доме!");
        }
    }
}
