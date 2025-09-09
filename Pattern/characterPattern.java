package Pattern;

public class characterPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        char ch = 'A'; // Starting character

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
