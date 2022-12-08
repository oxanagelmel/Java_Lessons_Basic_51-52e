package lesson6Dez01;

public class CalcTest {
    public static void main(String[] args) {
       // Calculator calc = null;
       // calc = new Calculator();
        Dog sharik = null; // указатель на ничто, у нас пока нет собаки физически
        sharik = new Dog("sharik sharikovich");// создаём с помощью конструктора, инициализируем
        Calculator calc = new Calculator();
        int sum = calc.sum(5, 6);
        System.out.println(sum);
        int minus = calc.minus(10, 3);
        System.out.println(minus);
        int mult = calc.mult(3, 4);
        System.out.println(mult);
        int div = calc.div(7, 3);
        System.out.println(div);
        short first = 1;
        short second = 2;
        int sumOf2Shorts = calc.sum(first, second);// автоматическое преобразование
        calc.sum(34L, 14L);


    }
}
