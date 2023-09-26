//Java Program to Check If a Number is Neon number or not.

import java.util.Scanner;

public class Level1Day3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate the square of the number
        int square = num * num;

        int sumOfDigits = 0;
        int temp = square;

        // Calculate the sum of digits of the square
        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            temp /= 10;
        }

        // Check if the sum of digits is equal to the original number
        if (sumOfDigits == num) {

            System.out.println("\n\n" + num + " is a neon number.");

        } else {

            System.out.println("\n\n" + num + " is not a neon number.");
        }

        scanner.close();
    }
}
