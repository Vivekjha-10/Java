package Loops;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 10899;

        while (n != 0) {
            int lastdigit = n % 10; // Get the last digit
            System.out.print(lastdigit); // Print the digit
            n /= 10; // Remove the last digit from n
        }

        System.out.println();
    }       
}
