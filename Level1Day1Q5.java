//Java program to add two binary strings.

public class Level1Day1Q5 {

    public static void main(String[] args) {

        int num1 = Integer.parseInt("1111", 2);
        int num2 = Integer.parseInt("1100", 2);

        System.out.println(num1);
        System.out.println(num2);

        int sum = num1 + num2;

        System.out.println(sum);

        String result = Integer.toBinaryString(sum);

        System.out.println(result);

    }
}
