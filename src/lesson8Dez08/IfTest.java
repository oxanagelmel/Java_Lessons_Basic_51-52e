package lesson8Dez08;

public class IfTest {
    public static void main(String[] args) {
        int num = 3;
        // если больше 3 говори больше, иначе если равно 3 говори 3, иначе говори меньше 3

        if (num > 3) { //условие
            System.out.println("число больше 3"); // если выполняется, то всё хорошо

        } else if (num == 3) {
            System.out.println("число равно 3");

        } else {
            System.out.println("число меньше 3");// если верхнее ложное/не выполняется, то добавляем else
        }

    }


}
