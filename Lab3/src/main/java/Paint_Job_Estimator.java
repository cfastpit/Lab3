
import java.util.Scanner;

public class Paint_Job_Estimator {

    /* A painting company has determined that for every 
    115 square feet of wall space,
        one gallon of paint and eight hours of labor will be required. 
        The company charges $18.00 per hour for labor. 
 
    Write a program that allows the user to enter the number of rooms to be painted 
and the price of the paint per gallon. It should also ask for the square feet of wall space
in each room. 
    
The program should have methods that return the following data:
The number of gallons of paint required
The hours of labor required
The cost of the paint
The labor charges
The total cost of the paint job
Then it should display the data on the screen
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int SQUARE_FEET_OF_WALL_SPACE = 115;
        final int ONE_GALLON_OF_PAINT_PER_HOUR = 8;
        final double HOUR_OF_LABER = 18.00;
        int numberOfSquareFeet = 0;

        System.out.println("Please enter the number of rooms");
        int numberOfRooms = keyboard.nextInt();
// this is to find sq ft
        while (numberOfRooms > 0) {
            System.out.println("how many square feet is in room " + numberOfRooms);

            int numberOfSquareFeetEntered = keyboard.nextInt();

            numberOfSquareFeet = numberOfSquareFeet + numberOfSquareFeetEntered;
            numberOfRooms = numberOfRooms - 1;
        }
        System.out.println("Please enter the price of paint per gallon");
        double priceOfPainPerGallon = keyboard.nextDouble();
        //output  number of gallons of paint required
        // output The hours of labor required
        //output The cost of the paint
        //output The labor charges
        //output The total cost of the paint job
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}







