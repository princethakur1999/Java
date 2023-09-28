//Java program to find the perimeter of a Rectangle.

import java.util.Scanner;

public class Level1Day4Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("\n\nThe perimeter of the rectangle is: " + perimeter);
    }
}
