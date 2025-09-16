🔹 Bubble Sort Kya Hai?

Bubble Sort ek simple sorting algorithm hai jo array ke elements ko repeatedly compare karke swap karta hai jab tak array sorted na ho jaye.
Isme adjacent (padosi) elements compare hote hain aur agar wo galat order me hote hain to unko swap kar dete hain.

🔹 Working Example (Step by Step)

Maan lo ek array hai:
[5, 3, 1, 4, 2]

Pass 1:

Compare (5,3) → swap → [3, 5, 1, 4, 2]

Compare (5,1) → swap → [3, 1, 5, 4, 2]

Compare (5,4) → swap → [3, 1, 4, 5, 2]

Compare (5,2) → swap → [3, 1, 4, 2, 5]

👉 Sabse bada element end me chala gaya.

Pass 2:

Compare (3,1) → swap → [1, 3, 4, 2, 5]

Compare (3,4) → no swap → [1, 3, 4, 2, 5]

Compare (4,2) → swap → [1, 3, 2, 4, 5]

👉 Dusra bada element bhi apni jagah pe aaya.

Pass 3:

Compare (1,3) → no swap → [1, 3, 2, 4, 5]

Compare (3,2) → swap → [1, 2, 3, 4, 5]

👉 Array sorted ho gaya 🎉.

🔹 Java Code for Bubble Sort
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        
        // Outer loop -> kitni baar pass chalana hai
        for (int i = 0; i < n - 1; i++) {
            // Inner loop -> adjacent elements compare karne ke liye
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 4, 2};
        
        System.out.println("Before Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        bubbleSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

🔹 Output
Before Sorting:
5 3 1 4 2 
After Sorting:
1 2 3 4 5

🔹 Time Complexity

Best Case (already sorted) → O(n) ✅ (optimized bubble sort with flag)

Worst Case → O(n²)

Space Complexity → O(1) (in-place sorting)





perfect 👍 chalo ab tumhare code me hi optimized bubble sort implement karte hain.

Optimization idea simple hai → ek flag (swapped) use karenge.

Agar ek pass me koi swap nahi hota, iska matlab array already sorted hai → loop ko break kar do.

Isse best case me time complexity O(n) ho jati hai.

🔹 Optimized Code (Tumhare Code ke Andar)
package Shorting;

public class Bubble {
    public static void bubbleshort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // flag to check if any swap happens

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // swap hua
                }
            }

            // agar koi swap nahi hua -> array sorted hai -> break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleshort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

🔹 Output
Sorted Array:
1 2 3 4 5

🔹 Difference

Normal Bubble Sort → hamesha n-1 passes chalata hai chahe array sorted ho ya nahi.

Optimized Bubble Sort → agar ek pass me koi swap nahi hota to turant break ho jata hai → fast.

👉 Ab tumhe ye clear hoga ki optimization se best case O(n) ho jata hai.

