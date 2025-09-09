package conditionalQuestionSet;

import java.util.Scanner;

public class checkLeapYear {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 400 == 0) && (year % 100 == 0));

        // Check if the year is a leap year
        if ((x && (y || z))) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
