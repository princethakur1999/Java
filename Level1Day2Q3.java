//Java Program to Find the Biggest of 3 Numbers.

import java.util.*;

public class Level1Day2Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        // Read three numbers from the user
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Find the largest number using if-else statements
        double largest;

        if (num1 >= num2 && num1 >= num3) {

            largest = num1;

        } else if (num2 >= num1 && num2 >= num3) {

            largest = num2;

        } else {

            largest = num3;
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
