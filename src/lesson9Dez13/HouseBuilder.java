package lesson9Dez13;

import java.util.Random;

public class HouseBuilder {
    //мы хотим построить дом и у него есть опр. Критерии

    public static int MAX_HIGH = 10;// Разрешено макс. 10 этажей

    public static void main(String[] args) {
        Random random = new Random();
        boolean isHasRoof = random.nextBoolean(); // у него должна быть крыша
        boolean isHasWall = random.nextBoolean(); // у него должны быть стены
        int high = random.nextInt(15);     // переменная говорит какая высота, от 1 до 15 = пишется 15
        // %s - строка (чтобы мы не подали как параметр он будет переведён в строку)
        // %b - boolean
        // %d - digit input (double) число на входе

        System.out.printf("Крыша есть? %s , Стены есть? %s высота : %s%n", isHasRoof, isHasWall, high); // можно и %s\n
                                                                                                       //и %d%n / %d.0%n
        // мы принимаем объект если есть крыша, есть стены и высота меньше 10
        //if (isHasRoof && isHasWall && high <= MAX_HIGH) {
        //    System.out.println("принимаем");
        //} else {
        //    System.out.println("не принимаем");
        //}

 /*     Делаем поэтапную проверку, так что if (isHasRoof && isHasWall && high <= MAX_HIGH) {
                                              System.out.println("принимаем");   можно не писать
        Как это сделать?
        if (!isHasRoof){     // если одно не правильно, то дальше программа не проверяет -> взаимно исключаемое условие
            System.out.println("нет крыши");
        } else if (!isHasWall) {
            System.out.println("нет стены");
        } else if (high > MAX_HIGH) {
            System.out.println("не соответствуем высота");
        } else {
            System.out.println("Everything is ok");
        }*/
        if (isHasWall) { // 1 x x
            if (isHasRoof) { // 1 1 x
                if (high <= MAX_HIGH) { // 1 1 1
                    //все ок
                } else { // 1 1 0
                    //высота не ок
                }
                //
            } else { //1 0 x
                if (high <= MAX_HIGH) { // 1 1 0
                    //крыша не ок
                } else { // 1 0 0
                    //крыша и высота не ок
                }
            }
        } else { // 0 x x
            if (isHasRoof) {
                if (high <= MAX_HIGH) {
                    //стена не ок
                } else {
                    //стена и высота не ок
                }
                //
            } else {
                if (high <= MAX_HIGH) {
                    //стена и крыша не ок
                } else {
                    //стена и крыша и высота не ок
                }
            }
        }
    }
}
