//Java Program to find the LCM of two numbers.

class Level1Day2Q4 {

    public static void main(String[] args) {

        int a = 10, b = 25;

        int ans = (a > b) ? a : b;

        // Checking for a smallest number that can be divided by both numbers
        while (true) {

            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }

        // Printing the Result
        System.out.println("LCM of " + a + " and " + b + " : " + ans);
    }
}
