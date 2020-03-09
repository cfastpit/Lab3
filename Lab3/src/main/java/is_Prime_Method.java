
import java.util.Scanner;

public class is_Prime_Method {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a integer biger then 0");
        int testPrime = keyboard.nextInt();
        boolean output = testPrime(testPrime);

        System.out.println(output);
       if(output=true){
           System.out.println("this is not prime");
       }
        if(output=false){
           System.out.println("this is rime");
       }
    }

    public static boolean testPrime(int testprime) {
        boolean testPrimeNumber = false;
        int test = 1;
        for (int x = testprime - 1; x > 1; x--) {
            test = testprime % x;
            if (test == 0) {
                testPrimeNumber = false;
                break;

            } else {
                testPrimeNumber = true;
            }
        }

//mod or %
        return testPrimeNumber;
    }
}
