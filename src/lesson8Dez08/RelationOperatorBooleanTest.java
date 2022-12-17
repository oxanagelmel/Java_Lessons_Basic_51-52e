package lesson8Dez08;

public class RelationOperatorBooleanTest {
    public static void main(String[] args) {
        boolean isMoreOrEqual = 5 >= 7; //больше или равно
        boolean isEqual = 8 == 7; //равно ли?

        // чётное или нет -> делится ли на 2 -> остаток от деления на 2 равен ли нулю
        boolean isEven = 8 % 2 == 0;
        // делится ли на 3?
        boolean isDivBy3 = 9 % 3 == 0;

        System.out.println(isEven);
        System.out.println(isDivBy3);
    }
}
