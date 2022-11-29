package lesson2.homework;

public class Task4 {
    public static void main(String[] args) {
        /*4. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
        Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
        Отдельно выведите на экран сумму скидки от этой покупки.*/

        int a = 1000;
        int b = 500;
        int discount = 100;

        int paid = a + b - discount;

        int sale = 100 - paid / (a + b);

        System.out.println(paid);
        System.out.println(sale);
    }
}
