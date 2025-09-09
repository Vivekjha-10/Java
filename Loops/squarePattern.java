package Loops;

public class squarePattern {
    public static void main(String[] args) {
        int n = 5; // Size of the square pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
