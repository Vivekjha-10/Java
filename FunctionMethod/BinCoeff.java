package FunctionMethod;

public class BinCoeff {
    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int bincoeff(int n, int r) {
        int Fact_n = factorial(n);
        int Fact_r = factorial(r);
        int Fact_n_r = factorial(n - r);

        int Binom = Fact_n / (Fact_r * Fact_n_r);
        return Binom;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = bincoeff(n, r);
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " + result);
    }
}
