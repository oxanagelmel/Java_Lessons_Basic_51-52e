package lesson6Dez01;

public class Calculator {
    public int sum(int first, int second) {
        return first + second;
    }

    public int sum(short first, short second) { //вызов метода sum
        return first + second;
    }
    //byte -> short -> int -> long
    //byte -> short -> int -> double


    public long sum(long first, long second) {
        return first + second;
    }

    public double sum(double first, double second) {
        return first + second;
    }

    public int mult(int first, int second) {
        return first * second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int div(int first, int second) {
        return first / second;
    }

}
