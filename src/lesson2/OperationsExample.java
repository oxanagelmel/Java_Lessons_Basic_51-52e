package lesson2;

/**
 * @author Oxana Gelmel
 */

public class OperationsExample {
    public static void main(String[] args) {
        int val = 9;
        int val2 = 6;
        double val3 = 6.0;

        int sum = val + val2;
        int subtraction = val - val2;
        int mutiplication = val * val2;
        int div = val / val2;
        int mod = val % val2;
        double div2 = val / val3;

        /*int valueForAdd = 5;
        valueForAdd = valueForAdd + 2;
        System.out.println(valueForAdd);

        int valueForAdd2 = 5;
        valueForAdd2 -= 2; //valueForAdd2 = valueForAdd2 - 2
        System.out.println(valueForAdd2);

        int valueForAdd3 = 5;
        valueForAdd3 ++; //valueForAdd3 += 1;
        System.out.println(valueForAdd3);

        byte b = 127;
        b -= 3;
        System.out.println(b);*/

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(mutiplication);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(div2);
    }
}
