//Java program to find factorial of given number.

public class Level1Day4Q1 {

    public static void main(String[] args) {

        int number = 5;

        int f = 1;

        while (number >= 1) {

            f = f * number;

            number--;
        }

        System.out.println("Factorial = " + f);
    }
}