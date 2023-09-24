//Java program to add two binary strings.

public class Level1Day1Q5 {

    public static void main(String[] args) {

        int n1 = Integer.parseInt("1111", 2);
        int n2 = Integer.parseInt("1001", 2);

        int sum = n1 + n2;

        String result = Integer.toBinaryString(sum);

        System.err.println(n1);
        System.out.println(n2);
        System.out.println(sum);
        System.out.println(result);
    }
}
