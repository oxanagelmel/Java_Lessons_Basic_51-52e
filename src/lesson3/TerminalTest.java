package lesson3;

import java.util.Scanner;

public class TerminalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Schreiben Sie die Zahl");
        int x = scan.nextInt();
        int y = x + 3 - x * 2;
        System.out.println("Ergebniss = " + y);
    }
}
