package lesson6Dez01;

import java.util.Random;

public class ConverterTest {
    public static void main(String[] args) {
        Random random = new Random(); //когда не знаешь какой курс
        double rate = random.nextDouble(1.01, 1.03);
        System.out.println("Курс обмена сейчас: " + rate);
        Converter converter = new Converter(rate);

        int usd = random.nextInt(500); // от 0 - 500, eur -> usd
        System.out.println("Usd total " + usd);
        System.out.println(converter.toEur(usd));

        int eur = random.nextInt(500); // от 0 - 500, usd -> eur
        System.out.println("Eur total " + eur);
        System.out.println(converter.toUsd(eur));
    }
    //когда знаешь какой курс
    //Converter converter = new Converter(rate); -> курс в Converter -e
    //System.out.println(converter.toEur(100);
    //System.out.println(converter.toUsd(100));
}
