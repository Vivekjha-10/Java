package Array;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {

        int n = numbers.length;

        for(int i = 0; i < n; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println( key +" not found");
        } else {
            System.out.println(key + " found at index: " + index);
        }   
        
    }
}
