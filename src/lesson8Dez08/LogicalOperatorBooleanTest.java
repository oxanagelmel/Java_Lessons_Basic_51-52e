package lesson8Dez08;

// Таблица истинности
// Логические оператор
public class LogicalOperatorBooleanTest {
    public static void main(String[] args) {
        int i = 7;
        boolean isDiv2or3 = (i % 2 == 0) || (i % 3 == 0);
        boolean isDiv2and3 = (i % 2 == 0) && (i % 3 == 0);

        //1011
        int num = 11;
        int num2 = 12;
        System.out.println(num & num2); // побитовая операция

        //num = num<<3; побитовый сдвиг в лево
        //num = num>>1; побитовый сдвиг в право
        //Math.pow(2,10); -> возведение в степень -> 2 power of 10
        //System.out.println(num);

        System.out.println(isDiv3AndNot5(15));
    }
        //метод, который возвращает ответ на вопрос: делится ли число на 3 и
        //не делится на 5 -> num % 3 == 0
        public static boolean isDiv3AndNot5(int num){

        return (num % 3 == 0) && (num % 5 != 0);
        }


}
