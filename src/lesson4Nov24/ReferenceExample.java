package lesson4Nov24;

public class ReferenceExample {
    public static void main(String[] args) {
        int i = 4; // 4
        int b = i; // 4 скопировали
        i++;       // ++ = +1 (увеличиваем на 1); 5
        Flower rose = new Flower(); // создали физически цветок
        Flower tulip = rose; // здесь происходит ссылка на тот новый цветок
        tulip.size = 3;
        rose.size = 5;
        System.out.println(tulip.size); // у tulip будет размер розы потому что они смотрят на один и тот же
        //System.out.println(b);
    }
}
