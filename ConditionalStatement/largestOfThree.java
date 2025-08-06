public class largestOfThree {
    public static void main (String[] args) {
        int a=1, b=3, c=6;

        if( (a >= b) && (a >= c)) {
            System.out.println("Largest number is: " + a);
        } 
        else if (b >= c) {
            System.out.println("Largest number is:" + b);
        }   
        else {
            System.out.println("Largest number is:" + c);
        }
    }
}
