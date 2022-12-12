package lesson7Dez06;

import java.util.HashMap;
import java.util.Map;

public class ClassInClassBeispiel {
  /*  public static void main(String[] args) {
        //Вася - 765
        //Петя - 665
        Map map = new HashMap(); // Map = структура данных = ключ значений - siehe oben
        Map.Entry entry = HashMap.entry(); // Map.Entry это одно такое значение
        entry.getKey(); // есть ключ и
        entry.getValue(); // есть значение
        //такое применяется если например какая то строчка не может логически существовать отдельно от самой зап. книжки
        //так что делают класс внутри класса

    }*/
    //Внутренний класс
    static class InnerClass { //не может быть тут не статическим

  } //но лучше создавать извне

    public static void main(String[] args) {
        ClassInClassBeispiel.InnerClass c = new InnerClass();

  }
}
