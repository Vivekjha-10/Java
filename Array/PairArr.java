package Array;

public class PairArr {
    public static void pairArr(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = 0; j < number.length; j++) {
                System.out.print("("+ curr +", "+number[j] +")");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairArr(numbers);
    }
}
