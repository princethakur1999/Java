//Java Program to Add two Complex Numbers.

public class Level1Day2Q1 {

    public static void main(String[] args) {

        // Define the first complex number
        double real1 = 2.6;
        double imaginary1 = 3.0;

        // Define the second complex number
        double real2 = 1.2;
        double imaginary2 = -2.0;

        // Calculate the sum
        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;

        // Display the result
        System.out.println("\nFirst Complex Number: " + real1 + " + " + imaginary1 + "i");
        System.out.println("\nSecond Complex Number: " + real2 + " + " + imaginary2 + "i");

        System.out.println("\n\nSum of Complex Numbers: " + realSum + " + " + imaginarySum + "i");
    }
}
