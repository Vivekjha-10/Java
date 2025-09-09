package Loops;

public class breakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i equals 3
            }
            System.out.println("Current value of i: " + i);
        }
    }
}
