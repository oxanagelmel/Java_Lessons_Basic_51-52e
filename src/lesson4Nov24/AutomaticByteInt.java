package lesson4Nov24;

// Автоматическое преобразование

public class AutomaticByteInt {
    public static void main(String[] args) {

        byte b = 14; //переменная
        short s = b; //byte может стать short
        int i = s; //мы спокойно засунули short в int итд.
        long l = i;
        double d = l;


 /*   int i2 = l; // не возможно засунуть в int i2 - long,
                // потому что для хранения long нужно больше информации
                // нежели для хранения int.
                // Не возможно засунуть большую коробку м маленькую.
 */
        //Примеры
        int r = 1; //действие
        double square = Math.PI * r * r; //формула площадь круга
        // результат это double потому что PI это double
        // они совмещаются/преобразуются автоматически

        // упрощает работу, разравотчикам не нужно вручную выеснять что используется в классе,
        // так как они автоматически преобразуются друг к другу

        int longInt = 268435456;
        short fromInt = (short) longInt; //int привести к short, нужно явно сказать это в скобках
        System.out.println(fromInt); //выходит 0
        //обрезает до 16ти а дальше всё 0

       /* int longInt1 = 268435584;
        short fromInt1 = (short) longInt1; //int привести к short, нужно явно сказать это в скобках
        System.out.println(fromInt1); //выходит 128
        // здесь было число 0001 000.... 1000 0000
        // когда есть эта вторая 1, программа обрезает все нули что до неё и вызодит 128
*/

        int longInt2 = 268435456;
        short fromInt2 = (short) longInt;
        long longLong = 12345667; // входит в int
        int intFromLong = (int) longLong;   // преобразуем к (int),
                                            // срезает лишнее и оставляет только то что входит в переменную
        System.out.println(fromInt2);
        System.out.println(intFromLong); //????
        //-> явное привидение типов

    }
}