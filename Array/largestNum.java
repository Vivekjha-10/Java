package Array;

public class largestNum {
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; 

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 8, 5, 6, 7};
        System.out.println("Largest number is: " + largest(numbers));
        System.out.println("Smallest number is: " + smallest(numbers));
    }
}
