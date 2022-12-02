package lesson4Nov24;

public class CharTest {
    public static void main(String[] args) {
        char g = 'g';
        int v = 's'+ 'g'; // s -> int + g -> int         // -> = преобразуется
        int one = '1' - 48;
        int num = Character.getNumericValue('6');

        System.out.println(v);
        System.out.println(one);
        System.out.println(num);

    }
}
