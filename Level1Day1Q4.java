//Java Program to Swap Two values using third variable.

public class Level1Day1Q4 {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println("Before swapping: " + x);
        System.out.println("Before swapping: " + y);

        int t;

        t = x;
        x = y;
        y = t;

        System.out.println("\nAfter swapping: " + x);
        System.out.println("\nAfter swapping: " + y);

    }
}
