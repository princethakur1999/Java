//Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes.

import java.util.Scanner;

public class Level1Day4Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {

                sum += a;
            }

            int c = a + b;

            a = b;
            b = c;
        }

        System.out.println("Sum of Fibonacci Series Numbers at Even Indexes up to " + n + " = " + sum);

    }
}
