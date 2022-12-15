package lesson8Dez08;

import java.util.Random;

public class HouseBuilder {
    public static int MAX_HIGH = 10;

    public static void main(String[] args) {
        Random random = new Random();
        boolean isHasRoof = random.nextBoolean();
        boolean isHasWall = random.nextBoolean();
        int high = random.nextInt(15);
        // %s - строка (чтобы мы не подали как параметр он будет переведён в строку)
        // %b - boolean
        // %d - digit input (double) число на входе

        System.out.printf("Крыша есть? %s , Стены есть? %s высота : %s%n", isHasRoof, isHasWall, high);

        // мы принимаем объект если есть крыша, есть стены и высота меньше 10
        //if (isHasRoof && isHasWall && high <= MAX_HIGH) {
        //    System.out.println("принимаем");

 /*       if (!isHasRoof){
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
