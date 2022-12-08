package lesson7Dez06;

public class MethodExamples {

    public static void main(String[] args) {
        int res = Integer.valueOf("123");// нужен valueOf что бы перевести строку в int
        res++;

        String str = "123" + "123"; //123123 выходит
        System.out.println(res);
        String first = "125";
        String second = "126";
        int result = sum(first, second);
        System.out.println(first + " +" + second + " +" + result);

    }

        //метод, который принимает 2 строки и возвращает 1 число - int -> сумма двух строк переведённых в int
        public static int sum(String first, String second) {
            int num1 = Integer.valueOf(first);
            int num2 = Integer.valueOf(second);
            return num1 + num2;
        }
}
