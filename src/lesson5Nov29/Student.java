package lesson5Nov29;

public class Student {
    private String name;
    private int age;

    public Student () {
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
