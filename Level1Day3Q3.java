//Java program to find Armstrong numbers between two integers.

import java.util.Scanner;

public class Level1Day3Q3 {

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int num) {

        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {

            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.print("\n\nArmstrong numbers between " + lowerLimit + " and " + upperLimit + " are: ");

        for (int num = lowerLimit; num <= upperLimit; num++) {

            if (isArmstrong(num)) {

                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
