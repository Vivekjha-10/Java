package FunctionMethod;

public class Binary {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int LastDigit = binNum % 10;
            decNum = decNum + (LastDigit * (int) Math.pow(2, pow));
            pow++;

            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " is: " + decNum);
    }

    public static void main(String[] args) {
        int binNum = 101;
        binToDec(binNum);
    }
}
