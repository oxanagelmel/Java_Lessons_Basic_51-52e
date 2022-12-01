package lesson2Nov17;

public class Aufgabe {
        public static void main(String[] args) {
        /*Даны переменные:
        - деньги которые у нас есть - 1000 рублей
        - стоимость пиццы - 230 рублей
        - стоимость жвачки - 26 рублей
        - стоимость конфеты - 2,5 рубля
        Задача:
        представим себе что мы зашли в магазин, и наша задача:
        купить максимум возможных пиц, затем на сдачу купить максимум жвачек,
        затем на оставшуюся сдачу купить конфет.
        В результате нам нужно сделать математический просчет
        и вывести на консоль примерно вот такую информацию:

        На эти деньги мы можем купить:
        - 4 пиццы
        - 3 жвачки
        - 0 конфет
        Сдача с магазина: 2 рубля.*/

            int money = 1000;
            int pizzaPrice = 230;
            int gymPrice = 26;
            double candyPrice = 2.5;
            int howManyPizza = money / pizzaPrice; // 4 целых
            int moneyAfterPizza = money % pizzaPrice; // осталось 80 руб
            int howManyGym = moneyAfterPizza / gymPrice; // 3 целых (80 / 26 = 3 (2))
            int moneyAfterGym = moneyAfterPizza % gymPrice; // осталось 2 рубля
            int howManyCandies = (int) (moneyAfterGym / candyPrice);
            double moneyResult = moneyAfterGym % candyPrice;
            System.out.println("Pizza gekauft: " + howManyPizza);
            System.out.println("Kaugummi gekauft: " + howManyGym);
            System.out.println("Bonbons gekauft: " + howManyCandies);
            System.out.println("Geld übrig: " + moneyResult);

            // строка 31:
            // 8 / 2.5 = 3.2 --> 8 / 2.5 = (int) (3.2) -->3 нам нужно целое число
        }

}
