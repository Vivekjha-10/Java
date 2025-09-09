package Loops.loopQuestionSet;

import java.util.Scanner;

public class multiplication  {
    public static void PrintMultiplicationTable(int number) {
        int n = number;

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table:");
        int number = sc.nextInt();
        
        PrintMultiplicationTable(number);
    }
}
