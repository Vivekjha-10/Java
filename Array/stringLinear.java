package Array;

public class stringLinear {
    public static int stringlinear(String names[], String key) {   //// function to search string in array
        int n = names.length;

        for(int i = 0; i < n; i++) {
            if (names[i].equals(key)) {         ////  to compare string we use .equals() method
                return i;
            } 
        }

        return -1;
    } 

    public static void main(String[] args) {
        String names[] = {"Vivek", "Jha", "Ankit", "Ravi", "Aman"};
        String key = "Ravi";

        int index = stringlinear(names, key);    //// calling function
        if (index == -1) {
            System.out.println( key +" not found");
        } else {
            System.out.println(key + " found at index: " + index);
        }   
        
    }
}
