🔹 Array in Java
1. Definition

Array ek data structure hai jo ek hi type ke multiple elements ko contiguous memory me store karta hai.

Matlab: agar tumhe 100 numbers store karne hain to 100 variables banane ke bajaye tum ek hi array use kar sakte ho.

2. Array Declaration

Java me array banane ke do tareeke hain:

int[] arr;      // Recommended
int arr2[];     // Ye bhi valid hai



3. Array Initialization

Array ka size declare karte waqt fix karna padta hai.

int[] arr = new int[5];  // size = 5, default values = 0


Ya direct values de sakte ho:

int[] arr = {10, 20, 30, 40, 50};

4. Accessing Elements

Array me index 0 se start hota hai.

System.out.println(arr[0]);  // First element
System.out.println(arr[4]);  // Last element

5. Modifying Elements
arr[2] = 100;   // 3rd element ko update kar diya

6. Array Length
System.out.println(arr.length);  // total elements ka size

7. Array Traversal

👉 Using for loop:

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}


👉 Using for-each loop:

for (int num : arr) {
    System.out.println(num);
}

8. Example Program
public class ArrayExample {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Print original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Modify element
        arr[2] = 100;

        // Print updated array
        System.out.println("\nUpdated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

9. Output
Original Array:
10 20 30 40 50
Updated Array:
10 20 100 40 50

🔹 Important Points

Array ka size fix hota hai (runtime me decide hota hai, compile time pe nahi).

Agar size flexible chahiye to ArrayList use karte hain.

Array me homogeneous elements (same type) hi store kar sakte ho.