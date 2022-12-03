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
    public int height;

    private String address;
    public String owner;

    public House(int height, String owner){
        this.height = height;
        this.owner = owner;
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
