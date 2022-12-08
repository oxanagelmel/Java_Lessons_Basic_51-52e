package lesson7Dez06;

public class IntTest {
    public static void main(String[] args) {
        int a = 1;   //1
        int b = a++; //2, a++ -> a = a + 1; -> вернули а и прибавили a + 1 -> операция присваивания
        //копирует а к b и присваивает + 1
        //int b = a;
        // a = a +1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

