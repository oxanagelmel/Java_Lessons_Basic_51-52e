package lesson5Nov29.homework;

/**
 * @author Oxana Gelmel
 */
/*
1. Создайте объект House
2. создайте параметры length, width, height типа int
3. создайте параметры address, owner типа String
4. создайте несколько различных конструкторов
   высота и владелец могут меняться извне, адрес, ширина и длина не может
   (поля должны быть private и должны быть getter для них)
*/
public class House {
    private int lenght;
    private int width;
    private String address;

    public int height;
    public String owner;

    public House(int height, int width, int lenght, String owner, String address){  // 1 конструктор на основе всех параметров,
        this.height = height;                                                       // что у него есть.
        this.owner = owner;
        this.lenght = lenght;
        this.width = width;
        this.address = address;
    }

    public House(int width, int lenght, String address) {
        this.address = address;
        this.width = width;
        this.lenght = lenght;
    }



    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public String getAddress() {
        return address;
    }
}
