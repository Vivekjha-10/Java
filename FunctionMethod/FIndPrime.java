package FunctionMethod;

public class FIndPrime {
    public static boolean isPrime(int n) {
        
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int num = 2; num <= n; num++) {
           if (isPrime(num)) {
                System.out.print(num + " ");
           }
        }
    }

    public static void main(String[] args) {
        int n = 20;
        primeInRange(n);
    }
}
