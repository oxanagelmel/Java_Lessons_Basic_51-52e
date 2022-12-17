package lesson8Dez08.homework;

import java.util.Random;

//5) стране А ездят машины с номерами от 1 до 10000, в городе Б большая проблема с парковками по выходным,
// чтобы уменьшить количество пробок, власти решили пускать в город по выходным только легковые машины с четными номерами,
// напишите программу, которая принимает на вход два параметра: номер машины и isLorry (грузовая машина или нет),
// в результате программа выводит можно заезжать машине или нет в город

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1, 10000); 
        boolean isLorry = random.nextBoolean();          
        System.out.printf("номер %s грузовик? %s\n", num, isLorry); 
      
        //проверяем номер и какая машина заехала
        if (!isLorry && num % 2 == 0){
            System.out.println("можно заезжать");
        }else {
            System.out.println("нельзя заезжать");
        }
    }
}
