package lesson7Dez06;

//Реляционные операторы = операторы сравнения

public class BooleanExpr {
    public static void main(String[] args) {
        int f = 12;
        int s = 15;
        System.out.println("Первый больше чем второй?");
        System.out.println(f>s);
        boolean isSecondEqual = s == 15; // равно ли? ==
        boolean isNotEqual = f != 14; // не равно ли !=
        boolean firstValIsMoreEqual = f >= 11; // больше или равно ли число f >=
    }
}
