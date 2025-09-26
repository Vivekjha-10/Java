🔹 1. What is a Pair Array?

A pair means taking two elements from an array.

In Java, we can generate all possible pairs by using nested loops.

👉 Example:
Array: [1, 2, 3, 4]
Pairs:

(1,2), (1,3), (1,4)
(2,3), (2,4)
(3,4)

🔹 2. Types of Pairs
(a) Unique Pairs (No Repetition)

(1,2) is valid but (2,1) is skipped.

(1,1) is not allowed.
👉 Use loop: for (int j = i+1; j < n; j++)

(b) All Pairs (With Repetition)

(1,1) and (2,1) are also included.
👉 Use loop: for (int j = 0; j < n; j++)

🔹 3. Java Code (Unique Pairs)
public class PairArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        System.out.println("Unique Pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
}


👉 Output

Unique Pairs:
(1,2) (1,3) (1,4) 
(2,3) (2,4) 
(3,4)

🔹 4. Java Code (With Repetition)
public class PairArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        System.out.println("All Pairs (with repetition):");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
}


👉 Output

All Pairs (with repetition):
(1,1) (1,2) (1,3) 
(2,1) (2,2) (2,3) 
(3,1) (3,2) (3,3)