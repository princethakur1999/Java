//Java Program to Find GCD or HCF of 2 numbers.

import java.util.*;

public class Level1Day2Q5 {

    public static int calculateGCD(int a, int b) {

        if (b == 0) {

            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate the GCD
        int gcd = calculateGCD(num1, num2);

        // Display the GCD
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

    }
}
