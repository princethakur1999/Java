//Java program to check whether input character is a vowel or consonant.

import java.util.Scanner;

public class Level1Day3Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert the character to lowercase to simplify comparisons
        ch = Character.toLowerCase(ch);

        // Check if the character is a letter
        if ((ch >= 'a' && ch <= 'z')) {

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                System.out.println("\n\n" + ch + " is a vowel.");

            } else {

                System.out.println("\n\n" + ch + " is a consonant.");
            }

        } else {

            System.out.println("\n\n" + ch + " is not a valid letter.");
        }

        scanner.close();
    }
}
