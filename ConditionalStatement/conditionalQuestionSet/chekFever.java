package conditionalQuestionSet;

public class chekFever {
    public static void main(String[] args) {
        double temperature = 101.5;

        if (temperature > 100.4) {
            System.out.println("You have a fever.");
        } else if (temperature < 95.0) {
            System.out.println("You have hypothermia.");
        } else {
            System.out.println("Your temperature is normal."    );
        }
    }
}
