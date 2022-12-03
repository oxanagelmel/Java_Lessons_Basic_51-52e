package lesson5Nov29;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(18, "Vasya");  // мы можем создать здесь студента,
                                                               // потому что у нас есть конструктор студент
       //student.name = "Petya"; // nicht möglich zu ändern, da bei Student private steht
                                 // du kannst den Namen nur anzeigen lassen!

        System.out.println(student.getName());
        Flower flower = new Flower(3, 15, "Red");

        Scanner scanner = new Scanner(System.in);
    }
}
