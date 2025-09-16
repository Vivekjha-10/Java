🔹 Selection Sort Kya Hai?

Selection sort ek comparison-based sorting algorithm hai.

Ye array ko do parts me divide karke chalata hai:

Sorted part (jo left side me banta jata hai)

Unsorted part (jo right side me bacha hota hai)

Har pass me algorithm unsorted part me se minimum element dhundta hai aur usko sorted part ke starting me place karta hai (swap karke).

🔹 Real-Life Example 🛒

Socho tumhare paas ek basket of fruits hai jisme alag-alag size ke aam (mangoes) pade hain:
[Large, Small, Medium, Extra-Large, Tiny]

Aur tumhe unhe chhote se bada (ascending order) me lagana hai.

Kaise karoge?

Sare mangoes me se sabse chhota mango (Tiny) dhundho aur usko pehle jagah par rakh do.

Ab bache hue mangoes me se next chhota (Small) dhundho aur second place pe rakh do.

Fir next chhota (Medium) dhundho aur third place pe rakh do.

Aise hi process repeat karte jao jab tak sare mangoes sorted order me na aa jaye.

👉 Yehi Selection Sort ka working principle hai.

🔹 Step by Step Example

Array: [64, 25, 12, 22, 11]

Pass 1:

Minimum element (11) dhundho aur pehle element (64) ke sath swap karo → [11, 25, 12, 22, 64]

Pass 2:

Remaining me minimum (12) dhundho aur second element (25) se swap karo → [11, 12, 25, 22, 64]

Pass 3:

Remaining me minimum (22) dhundho aur third element (25) se swap karo → [11, 12, 22, 25, 64]

Pass 4:

Remaining me minimum (25) hai jo already sahi jagah pe hai → [11, 12, 22, 25, 64]

👉 Array sorted ho gaya ✅.

🔹 Java Code (Selection Sort)
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // assume minimum index
            int minIndex = i;

            // unsorted part me minimum element find karo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap minimum element with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);

        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

🔹 Output
Sorted Array:
11 12 22 25 64

🔹 Complexity

Best case: O(n²)

Worst case: O(n²)

Space complexity: O(1)

👉 Selection sort ka benefit ye hai ki minimum swaps karta hai (har pass me max 1 swap).

⚡ Real-life me socho:

Tum ek book shelf arrange kar rahe ho aur hamesha sabse patli book uthakar usko pehle rakhte ho.

Fir bachi hui me se next patli book dhundh kar second position me rakhte ho.

Aur aise hi poora shelf arrange kar dete ho.

👉 Kya chahte ho mai tumhe iska dry run table (pass by pass array state) bana du jaise bubble sort me kiya tha?

You said:
okk
ChatGPT said:

Bahut badiya 👌, ab mai tumhe Selection Sort ka Dry Run (table format) dikhata hoon, taki har pass me array kaise change hota hai wo clear ho jaye.

🔹 Example Array

[64, 25, 12, 22, 11]

🔹 Dry Run Table
Pass	Action (Find Minimum & Swap)	Array State
Start	Original array	[64, 25, 12, 22, 11]
Pass 1	Minimum element = 11 → swap with 64	[11, 25, 12, 22, 64]
Pass 2	Minimum element (25,12,22,64) = 12 → swap 25	[11, 12, 25, 22, 64]
Pass 3	Minimum element (25,22,64) = 22 → swap 25	[11, 12, 22, 25, 64]
Pass 4	Minimum element (25,64) = 25 → already right	[11, 12, 22, 25, 64]
End	Array sorted	[11, 12, 22, 25, 64]
🔹 Step-by-step Visualization

Pass 1: pura array me sabse chhota number (11) find karke first element se swap kiya.

Pass 2: bache hue array (25,12,22,64) me sabse chhota number (12) find karke second element se swap.

Pass 3: bache hue array (25,22,64) me sabse chhota (22) find karke third element se swap.

Pass 4: bache hue array (25,64) already sahi order me.

🔹 Real-life analogy

Tumhe sabse chhoti kitaab (book) almirah ke first slot me rakhni hai → Pass 1.

Bachi hui me se next chhoti kitaab second slot me rakhni hai → Pass 2.

Aur aise hi step by step, almirah sorted ho jati hai → last me sari kitaabe chhoti se badi order me.

👉 Is tarah selection sort har pass me ek element apni correct jagah pe fix kar deta hai.