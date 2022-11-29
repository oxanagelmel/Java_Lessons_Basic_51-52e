package lesson3;

public class classwork {
    public static void main(String[] args) {
        int val = 123;
        System.out.println(Integer.toBinaryString(val));
        /*System.out.println(Integer.toOctalString(val));
        System.out.println(Integer.toHexString(val));*/

        val = val>>1; // val / 2 = 1111 011 -> 1111 01
        System.out.println(Integer.toBinaryString(val));

        val = val<<1; // val * 2 = 1111 011 -> 1111 0110
        System.out.println(Integer.toBinaryString(val));
    }
}
