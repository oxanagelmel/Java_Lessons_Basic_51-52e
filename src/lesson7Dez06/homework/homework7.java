package lesson7Dez06.homework;

//1) Введите с консоли два числа и выведите больше ли второе число чем первое
public class homework7 {
 /*   public static void main(String[] args) {
        int one = 5;
        int two = 9;
        System.out.println("Второе число больше?");
        System.out.println(two > one); //ответ выводится в boolean
    }
*/
 //2) Создайте метод, который принимает 2 числа и возвращает больше или равно первое число
 //   по сравнению со вторым
    public static void main(String[] args) {
        boolean res = isMoreOrEquals(4, 5);
        System.out.println(res);
    }
    public static boolean isMoreOrEquals(int first, int second) {
        return first >= second; //вернуть

        //  System.out.println("Первое число больше или равно второму?");
        //  System.out.println(one>=two);
    }

//3) создайте метод, который будет принимать 2 строки и писать возвращать строку,
//   которая составляется склеиванием первой половины первого слова
//   и второй половины второго слова
//   Например:
//   Вход: "привет" и "цветок". На выходе будет "приток".
//   (при - первая половина от первого слова, ток - вторая половина от второго слова)

    public static String smartConcat(String str1, String str2){
        String f = str1.substring(0, str1.length()/ 2); // от самой первой -> 0, разделить длину строки на пополам(на 2)
        String s = str2.substring(str2.length()/2, str2.length()); // от середины str2.length()/2 до конца str2.length()
                                                                   // общий случай когда мы вырезаем последнюю строку
        return f + s;
        //String s = str2.substring(str2.length()/2); можно и так c beginIndex
    }
      //  String str1 = "привет";
      //  String str2 = "цветок";
      //  System.out.println(str1.substring(0, 3) + str2.substring(3, 6));
}
