package Array;

public  class ArrayEx {
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
