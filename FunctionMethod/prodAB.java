package FunctionMethod;

public class prodAB {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = multiply(a, b);
        System.out.println("a * b  = " + result);
    }
}
