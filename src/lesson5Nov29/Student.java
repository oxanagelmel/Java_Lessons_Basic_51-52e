package lesson5Nov29;

public class Student {
    private String name;
    private int age;

    public Student () { // конструктор по умолчанию
                        // Конструктор нужен, что бы мы создавали объект
    }
    public Student(int age, String name) { // конструктор
        this.age = age; // обращается к самому к себе
        this.name = name; // извне к нему пришло имя
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
