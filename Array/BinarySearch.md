🔹 Binary Search Kya Hai?

Binary Search ek fast searching algorithm hai jo sorted array par kaam karta hai.

Ye divide and conquer approach use karta hai.

Har step me array ko do parts me divide karta hai aur decide karta hai ki search element left part me hoga ya right part me.

🔹 Steps of Binary Search

Array ko sorted hona chahiye ✅

low aur high pointers set karo.

Mid index nikalo → mid = (low + high) / 2

Agar arr[mid] == key → element mil gaya 🎉

Agar arr[mid] < key → right side me search karo → low = mid + 1

Agar arr[mid] > key → left side me search karo → high = mid - 1

Jab tak low <= high hai tab tak search karte raho.

🔹 Java Code – Iterative Approach
public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // element found
            } 
            else if (arr[mid] < key) {
                low = mid + 1; // right side
            } 
            else {
                high = mid - 1; // left side
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 40;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println(key + " not found");
        } else {
            System.out.println(key + " found at index: " + result);
        }
    }
}

🔹 Output
40 found at index: 3

🔹 Time Complexity

Best case → O(1) (agar mid par hi element mil jaye)

Worst/Average case → O(log n)

Space complexity → O(1) (iterative approach)