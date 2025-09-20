package Shorting;

public class Selection {
    public static void selectoinShort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int minIndex = i;

            for(int j = i+1; j< n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;  
        } 
        
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectoinShort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
