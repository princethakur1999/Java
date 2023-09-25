//Java program to find all the prime numbers from 1 to N.

import java.util.Scanner;

public class Level1Day3Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int num = 2; num < n; num++) {

            boolean flag = false;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {

                    flag = true;

                    break;
                }
            }

            if (!flag) {

                System.out.println(num);
            }
        }
    }
}