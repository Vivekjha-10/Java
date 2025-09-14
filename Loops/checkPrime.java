package Loops;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println(n + " is a prime number.");
        } else {
            boolean isPrime = true;
            for(int i=2; i <= n-1; i++) {
                if(n % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                }
            }

            if(isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }   
        }
    }
}
