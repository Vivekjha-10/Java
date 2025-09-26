🔹 What is reversing an array?

Reversing an array means changing the order of elements so that:

The first element becomes last

The last element becomes first
and so on…

👉 Example:
[1, 2, 3, 4, 5] → [5, 4, 3, 2, 1]

🔹 Logic (Simple Explanation)

Take two pointers:

start → beginning of array

end → last index of array

Swap the elements at start and end.

Move start forward (start++) and end backward (end--).

Repeat this process until start < end.

🔹 Java Code
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        // loop until start is less than end
        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // print reversed array
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

🔹 Output
Reversed Array: 5 4 3 2 1


✅ Simple rule: Swap from both ends → move inward → stop when they meet.