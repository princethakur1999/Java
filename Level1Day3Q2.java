//Java program to check Leap-year by taking input from user.

import java.util.Scanner;

public class Level1Day3Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

            System.out.println(year + " : Leap Year");

        } else {

            System.out.println(year + " : Non-leap year");
        }
    }
}
