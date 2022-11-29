package lesson3;

/**
 * @author Oxana Gelmel
 */
public class TestRunner {
    public static void main(String[] args) {
        int val = 1;
        Student petya = new Student();
        System.out.println("Petya: " + petya.birthYear);
        petya.birthYear = 1991;
        System.out.println("Petya: " + petya.birthYear);
        Student vasya = new Student();
        vasya.birthYear = 1994;
        Student.PI = 134;
        System.out.println(Student.PI);
        System.out.println(Math.PI);

    }
}
