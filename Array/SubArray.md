🔎 What is a Subarray?

👉 Subarray = Continuous (lagataar) portion of an array.

Ek array ke andar se hum ek particular continuous sequence nikaalte हैं, usse subarray bolte हैं.

Elements ka order change nahi hota.

Elements skip nahi kar sakte.

✅ Example

Array: nums = [1, 2, 3]

Possible subarrays:

[1]

[1, 2]

[1, 2, 3]

[2]

[2, 3]

[3]

👉 Total subarrays = n*(n+1)/2 (yahan n=3 → 6 subarrays).

⚠️ {1, 3} subarray nahi hai, kyunki wo continuous nahi hai.

🔄 Difference between Subarray, Substring, Subsequence

Subarray → continuous portion of array

Substring → continuous portion of string (same as subarray but for strings)

Subsequence → order same, but elements skip kar sakte ho

Example with [1, 2, 3]

Subarrays: [1, 2], [2, 3] ✅

Subsequences: [1, 3] (allowed) ❌ subarray

🔢 Formula for Number of Subarrays

For an array of length n:
👉 Total subarrays = n * (n + 1) / 2

Example:

n = 5 → total subarrays = 5 * 6 / 2 = 15

🧑‍💻 Example Code to Print Subarrays
public class SubArrayExample {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.print("[ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        printSubarrays(nums);
    }
}

Output:
[ 1 ]
[ 1 2 ]
[ 1 2 3 ]
[ 2 ]
[ 2 3 ]
[ 3 ]

⚡ Why are Subarrays Important?

Subarray concept bahut saare algorithms me use hota hai, jaise:

Maximum Subarray Sum → (Kadane’s Algorithm)

Sliding Window Problems

Prefix Sum / Subarray Sum Queries

Dynamic Programming Problems

🏁 Summary

Subarray = continuous portion of array

Total subarrays = n*(n+1)/2

Subarray vs Subsequence → subarray continuous hota hai, subsequence me skip allowed hai.

Coding me iska use hota hai sum, max/min, sliding window, prefix sum jaise problems me.