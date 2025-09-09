package Loops;

import java.util.Scanner;

public class printNumberUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
          System.out.print(counter + " ");
            counter++;
        } 
    }
}
