import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /, %, ^, m):");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            case '%':
                System.out.println("Modulus: " + (a % b));
                break;  
            case '^':
                System.out.println("Power: " + Math.pow(a, b));
                break;  
            case 'm':
                System.out.println("Maximum: " + Math.max(a, b));
                break;
            default:
                break;
        }
    }
}
