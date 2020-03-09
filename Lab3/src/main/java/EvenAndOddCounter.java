
import java.util.Random;

public class EvenAndOddCounter {

    public static void main(String[] args) {
        Random rand = new Random();
        int evenCounter = 0;
        int oddCounter = 0;
        for (int x = 100; x >= 1; x--) {
            boolean check = isEven(rand.nextInt(1000));
            if (check == true) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("even counter is " + evenCounter);
        System.out.println("odd counter is " + oddCounter);
    }

    public static boolean isEven(int number) {
        boolean numberIs = true;
        if ((number % 2) == 0) {
            numberIs = true;

        } else {

            numberIs = false;

        }
        return numberIs;
    }
}
