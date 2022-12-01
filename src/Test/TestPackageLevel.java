package Test;

import lesson4Nov24.Flower;

public class TestPackageLevel {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.size = 3;// доступ к переменной size у цветка
                        // имеют только те кто находится в том же пакете, а не здесь,
                        // из за этого "size" красный
        //flower.price = 12;

    }
}
