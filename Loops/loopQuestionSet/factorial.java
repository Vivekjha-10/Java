package Loops.loopQuestionSet;

import java.util.Scanner;

import Loops.forLoops;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int fact = 1;

        System.out.println("Enter the number:");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("factorial of " + number + " is: " + fact);
    }
}
