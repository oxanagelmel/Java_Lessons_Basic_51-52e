package lesson9Dez13;

import java.util.Random;

public class MagicClass {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        String str = null;
        if (num > 50){
            str = "mehr als 50";
        }else {
            str = "weniger oder gleich 50";
        }
        //Тернарный оператор - упрощённый if
        str = num > 50 ? "mehr als 50" : "weniger oder gleich 50";
        //сначала условие, ? , чему будет равно значение в "", :, второе значение
        // если пишем метод
    }
    public static String getStrValue (int num){
        //какая то логика
    /*    if (num > 50){
            return "mehr als 50";
        }else {
            return "weniger oder gleich 50";
        }*/
        return num > 50 ? "mehr als 50" : "weniger oder gleich 50";
    }
}
