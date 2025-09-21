package Array;

public class UpdateArray {
    public static void update(int arr[], int nonChangable   ) {
        
         nonChangable = nonChangable + 1;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int nonChangable = 5;
        update(arr, nonChangable);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
