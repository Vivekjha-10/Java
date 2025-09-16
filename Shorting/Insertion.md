🔹 Insertion Sort Kya Hai?

Insertion Sort ek simple sorting algorithm hai jo array ko sorted aur unsorted part me divide karta hai:

Suru me sirf pehla element sorted maana jata hai.

Fir ek-ek karke unsorted part ka element uthaya jata hai aur usko sorted part me apni sahi jagah insert kar diya jata hai.

🔹 Real-Life Example ✍️

Socho tumhe cards arrange karne hain (like playing cards) apne haath me:

Pehle card ko sorted maan lo.

Dusra card uthao aur check karo ki usko pehle card ke pehle rakhna hai ya baad me.

Teesra card uthao aur usko pehle se sorted cards me apni sahi jagah pe ghusa do.

Aise hi ek-ek karke sare cards sorted ho jate hain.

👉 Yehi process Insertion Sort ka hai.

🔹 Example Array

[5, 4, 6, 2, 3, 1]

Pass 1 (key = 4):

Compare 4 with 5 → 4 chhota hai → insert before 5
👉 [4, 5, 6, 2, 3, 1]

Pass 2 (key = 6):

Compare 6 with 5 → 6 bada hai → already sahi jagah pe
👉 [4, 5, 6, 2, 3, 1]

Pass 3 (key = 2):

Compare 2 with 6 → shift
Compare 2 with 5 → shift
Compare 2 with 4 → shift
👉 Insert 2 at beginning → [2, 4, 5, 6, 3, 1]

Pass 4 (key = 3):

Compare 3 with 6 → shift
Compare 3 with 5 → shift
Compare 3 with 4 → shift
👉 Insert 3 after 2 → [2, 3, 4, 5, 6, 1]

Pass 5 (key = 1):

Compare 1 with 6 → shift
Compare 1 with 5 → shift
Compare 1 with 4 → shift
Compare 1 with 3 → shift
Compare 1 with 2 → shift
👉 Insert at beginning → [1, 2, 3, 4, 5, 6]

🔹 Java Code (Insertion Sort)
public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];  // current element
            int j = i - 1;

            // shift elements of sorted part that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 2, 3, 1};
        insertionSort(arr);

        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

🔹 Output
Sorted Array:
1 2 3 4 5 6

🔹 Complexity

Best case (already sorted array): O(n) ✅

Worst case (reverse sorted): O(n²)

Space complexity: O(1)

👉 Real-life analogy fir se socho: cards arrange karna apne haath me.
Har baar naya card uthate ho aur apne existing cards ke beech me sahi jagah dal dete ho → wahi insertion sort hai.

Kya chahte ho mai iska dry run table (step by step array states) bhi bana kar dikhau jaise selection sort me kiya tha?

You said:
package Shorting;

public class Insertion {
    public static void insertionshort(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int key = arr[i];      /* ............current position */
            int j = i-1;           /* ............previous position */

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {50,40,10,30,20};
        insertionshort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}    explin kroise
ChatGPT said:

Bhai, tumne Insertion Sort ka bilkul sahi code likha hai 👍
Chalo ise step by step samjhate hain (with dry run).

📌 Code Explanation
for(int i = 1; i < n; i++) {
    int key = arr[i];      // current element jo humko correct jagah pe insert karna hai
    int j = i - 1;         // uske pichle elements ko compare karne k liye


key → current element (jo insert karna hai correct jagah par)

j → key ke pichhle elements ko check karega

while (j >= 0 && arr[j] > key) {
    arr[j + 1] = arr[j];   // bada element ko ek step aage shift karo
    j = j - 1;             // pichhle element pe jao
}


Jab tak arr[j] key se bada hai → usko ek step aage shift kar do.

Isse key ke liye sahi jagah banegi.

arr[j + 1] = key;


Jab loop rukta hai → iska matlab key ka sahi position mil gaya.

Wahan key ko insert kar do. ✅

📌 Example Dry Run

Array: {50, 40, 10, 30, 20}

Step 1 (i=1, key=40):

Compare 40 with 50 → 50 > 40 → shift 50 → [50, 50, 10, 30, 20]

Insert 40 → [40, 50, 10, 30, 20]

Step 2 (i=2, key=10):

Compare 10 with 50 → shift → [40, 50, 50, 30, 20]

Compare 10 with 40 → shift → [40, 40, 50, 30, 20]

Insert 10 → [10, 40, 50, 30, 20]

Step 3 (i=3, key=30):

Compare 30 with 50 → shift → [10, 40, 50, 50, 20]

Compare 30 with 40 → shift → [10, 40, 40, 50, 20]

Insert 30 → [10, 30, 40, 50, 20]

Step 4 (i=4, key=20):

Compare 20 with 50 → shift → [10, 30, 40, 50, 50]

Compare 20 with 40 → shift → [10, 30, 40, 40, 50]

Compare 20 with 30 → shift → [10, 30, 30, 40, 50]

Insert 20 → [10, 20, 30, 40, 50]

✅ Final Sorted Array → [10, 20, 30, 40, 50]

📌 Real-Life Example

Socho tum cards arrange kar rahe ho apne haath me (jaise rummy khelte waqt 🃏).

Tum ek ek card utha kar usko apne haath me sahi jagah par insert karte ho.

Yehi exactly Insertion Sort hai.