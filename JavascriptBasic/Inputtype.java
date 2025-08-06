
import java.util.*;

public class Inputtype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        String name = sc.nextLine(); /* print sentence */
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        double quantity = sc.nextDouble();
        System.out.println(quantity);

         short short = sc.nextShort();
        System.out.println(quantity);

    }
}
