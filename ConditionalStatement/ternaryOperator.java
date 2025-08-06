public class ternaryOperator {
    public static void main(String[] args) {
        int number = 4;

        //Ternary Operator
        
      String type =  ((number % 2 == 0) ? "Even Number" : "Odd Number");
      
        System.out.println(type);
        
        // Using ternary operator for comparison
        int A = 5, B = 10;
        String comparison = (A > B) ? "A is Greater than B" : (A < B) ? "A is Less than B" : "A is Equal to B";
        
        System.out.println(comparison);

    }
}
