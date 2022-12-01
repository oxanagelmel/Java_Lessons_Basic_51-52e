package lesson4Nov24;

public class Flower {
    /*int size; // доступ к переменной в пакете у цветка
                // имеют только те кто находится в этом же пакете,
                // из за этого в папке Test-TestPackageLevel "size" красный
    */
    public int size;
    private int price = 13; // когда мы делаем private то поступ есть только у Flower,
                            // но не во всём пакете!
                            // Private запрещает работать извне как и внутри пакета/класса

    public int changePrice () {  //Итог: если хотим поменять, то вызываем метод
        //logic for price change
        //оповещаем продавца что цена поменялась
        //делаем дополнительное действие
        //сокрываем извне возможность изменения каких либо данных внутри Flower
        price = price + 10; // здесь мы можем изменить, так как сделали change
        return price;
    }
    public int getPrice() {
        return price;
    }
    /*protected int price = 13;*/
    //тоже самое что и private, только с небольшим послоблением!
    //в Java можно создавать дополнительно ветвление
    //есть цветок и его разновидность и у него есть разные параметры
}
