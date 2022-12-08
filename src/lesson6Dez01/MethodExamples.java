package lesson6Dez01;

public class MethodExamples {
    public static void doSmth(){ //doSmth() -> сигнатура метода

    }
    //всё это объявление метода
    public static void doSmth(int size){ //doSmth(int) -> сигнатура метода = название + входной параметр

    }
 /* private static void doSmth(int size){ //doSmth(int) -> ругается когда изменили на private так как сигнатура метода = название + входной параметр
                                          // в одном объекте не может быть двух методов с одинаковой сигнатурой
    }
*/

 /* public static void doSmth(int day) { //не возможно создать так как сигнатура одинаковая, не важно как мы её назвали

  }
*/
    // нужно изменить параметр
    public static void doSmth(long day){ //doSmth(long)

 }
    public static void doSmth(int size, long day){ //doSmth(int, long)

    }
    public static void doSmth(long day,int size){ //doSmth(long, int) -> не ругается так как мы поменяли параметры местами,
                                                  //а сигнатур должна вписываться в определённом порядке. Итог: новый метод!

    }
   /* public void doSmth(long day,int size){ //doSmth(long, int) -> неважно что мы изменим в начале,
                                           // программа ругается так как у нас одинаковая сигнатура

    }*/

}
