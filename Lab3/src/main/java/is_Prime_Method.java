
import java.util.Scanner;

public class is_Prime_Method {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a integer biger then 0");
        int testPrime = keyboard.nextInt();
        boolean output = testPrime(testPrime);

        
       if(output==true){
           System.out.println(testPrime+" is is prime");
       }
        if(output==false){
           System.out.println(testPrime+" is not prime");
       }
    }

    public static boolean testPrime(int testprime) {
        boolean testPrimeNumber = false;
        int test = 1;
        for (int x = testprime - 1; x > 2; x--) {
            test = testprime % x;
            if (test == 0) {
                testPrimeNumber = false;
                break;

            } else {
                testPrimeNumber = true;
            }
        }
        return testPrimeNumber;
    }
}
