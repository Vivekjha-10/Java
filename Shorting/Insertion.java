package Shorting;

public class Insertion {
    public static void insertionshort(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int key = arr[i];      /* ............current position */
            int j = i-1;           /* ............previous position */

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {50,40,10,30,20};
        insertionshort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
