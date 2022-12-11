package lesson6Dez01;

public class PizzaTime {
    public static void main(String[] args) {
        // 28 и 24 cm диаметры
        // 40 калорий = 1 квадратный см
        // насколько в большой пицце больше калорий
        double sqrSmall = Math.PI * 24 * 24;
        double sqrBig = Math.PI * 28 *28;
        double diff = (sqrBig - sqrSmall) * 40;
        System.out.println("Разница в калориях: " + diff);

        String str1 = "wow";
        String str2 = "ogo"; // str1, str2 -> wow-ogo-wow
        String res = magicFunc(str1, str2); // этот должен быть статическим внизу иначе программа ругается
        System.out.println(res);
    }
  /*  public String magicFunc(String s1, String s2) { //нельзя вызвать не сатический метод в первом статическом
        return s1 + "-" + s2 + "-" + s1;
    }
  */
    public static String magicFunc(String s1, String s2) { // здесь обяз. static
        return s1 + "-" + s2 + "-" + s1;
    }
}
