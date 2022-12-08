package lesson7Dez06;

import java.util.Random;

public class MethodTest {

    public static void main(String[] args) {
        //System.out.println(getRandomStudent());

        int i = 2;
        int j = 4;

     /*!*/
        int temp = i; // замену делать так не создавая метод
        i = j;
        j = temp;

       // swap(i, j); // передали копии создав метод внизу
        System.out.println(i);
        System.out.println(j);

    }
    // метод выбора студента
    public static int getRandomStudent() {
        Random random = new Random();
        return random.nextInt(10);

    }
    // метод, который принимает 2 числа и должен поменять местами эти 2 числа
    // first = [3] second = [4] temp = [3] имеет смысл делать жто в методе /array

    public static void swap(int first, int second) { // first = 3, second = 4 , сюда передаются копии
        int temp = first;
        first = second;
        second = temp;

    }
}
