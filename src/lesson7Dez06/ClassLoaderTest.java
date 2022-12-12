package lesson7Dez06;

import java.sql.Date;

public class ClassLoaderTest {
    public static void main(String[] args) {
        String str = "test sTring";
        Bottle bottle = new Bottle();
        Date date = new Date(1L);
        System.out.println(str.getClass().getClassLoader());
        System.out.println(date.getClass().getClassLoader());
        System.out.println(bottle.getClass().getClassLoader());

    }
}
