//Java program to demonstrate BufferedReader.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level1Day1Q2 {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.println("Hello, " + name + "!");

        } catch (IOException e) {

            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
