package Array;

public class KadaneSumSubArray {
    public static void kadaneSumSubArray(int numbers[]) {
        int n = numbers.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < n; i++) {
            currSum += numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our max subarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        kadaneSumSubArray(numbers); 
    }
}
