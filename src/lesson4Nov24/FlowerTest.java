package lesson4Nov24;


public class FlowerTest {
    public static void main(String[] args) {
        int i = 0; // локальные переменные это когда мы в методе что-то делаем,
                   // пока мы выполняем действие

        Flower flower = new Flower();
        flower.size = 3;    // здесь не красное так как мы в пакете где находится Flower!

        //flower.price = 12;  // когда мы делаем private в Flower то доступ есть только в классе Flower,
                            // но не во всём пакете!

        //мы не можем достать цену напрямую,
        //но можем достать через метод так как метод у нас публичный

        flower.getPrice();  // значение его мы не можем поменять извне,
                            // для этого и существует private переменная
    }
}
