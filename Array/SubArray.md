Brute Force (O(n³))

Prefix Sum (O(n²))

Kadane’s Algorithm (O(n))

Chalo step by step samjhate hain.

🔹 1. Brute Force Method (O(n³))

Idea:

Har possible subarray check karo.

Har subarray ka sum calculate karo.

Max sum update karte raho.

Code:

public static void maxSumSubArrayBrute(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {       // start
        for (int j = i; j < numbers.length; j++) {   // end
            int currSum = 0;

            for (int k = i; k <= j; k++) {           // sum
                currSum += numbers[k];
            }

            maxSum = Math.max(maxSum, currSum);
        }
    }

    System.out.println("Max Sum (Brute) = " + maxSum);
}


Time Complexity:

3 loops → O(n³)

Very slow for large arrays.

🔹 2. Prefix Sum Method (O(n²))

Idea:

Ek prefix array banao jisme har index tak ka cumulative sum stored ho.

Formula:

subarraySum(i...j) = prefix[j] - prefix[i-1]
(agar i=0 ho to sirf prefix[j])


Isse inner loop (sum nikalne wala) remove ho jata hai.

Code:

public static void maxSumSubArrayPrefix(int numbers[]) {
    int n = numbers.length;
    int prefix[] = new int[n];

    prefix[0] = numbers[0];
    for (int i = 1; i < n; i++) {
        prefix[i] = prefix[i - 1] + numbers[i];
    }

    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {          // start
        for (int j = i; j < n; j++) {      // end
            int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            maxSum = Math.max(maxSum, currSum);
        }
    }

    System.out.println("Max Sum (Prefix) = " + maxSum);
}


Time Complexity:

2 loops → O(n²)

Faster than brute force.

🔹 3. Kadane’s Algorithm (O(n)) ✅

Idea:

Ek hi loop mein max subarray sum nikal lo.

Har step par decide karo:

Current element ko existing subarray mein add karna hai?

Ya naya subarray start karna hai?

Agar currSum < 0 ho jaata hai, reset kar do.

Code:

public static void kadane(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {
        currSum += numbers[i];
        maxSum = Math.max(maxSum, currSum);

        if (currSum < 0) {
            currSum = 0;
        }
    }

    System.out.println("Max Sum (Kadane) = " + maxSum);
}


Time Complexity:

Single loop → O(n)

Best approach for large arrays.

🔹 Example Run

Array = {1, -1, 6, -1, 3}

Brute Force → checks all subarrays → max = 8

Prefix Sum → uses prefix[] → max = 8

Kadane’s Algorithm → smart reset → max = 8

👉 Output sabka same, lekin speed different.

