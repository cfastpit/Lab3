
import java.util.Scanner;

public class Paint_Job_Estimator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double numberOfSquareFeet = 0.00;

        System.out.println("Please enter the number of rooms");
        int numberOfRooms = keyboard.nextInt();
// this is to find sq ft
        while (numberOfRooms > 0) {
            System.out.println("how many square feet is in room " + numberOfRooms);

            double numberOfSquareFeetEntered = keyboard.nextDouble();

            numberOfSquareFeet = numberOfSquareFeet + numberOfSquareFeetEntered;
            numberOfRooms = numberOfRooms - 1;
        }
        System.out.println("Please enter the price of paint per gallon");
        double priceOfPaintPerGallon = keyboard.nextDouble();
        double outputOfPaint = numberOfGallonsOfPaint(numberOfSquareFeet);
        double outputOfPaintCost = theCostOfPaint(outputOfPaint, priceOfPaintPerGallon);
        double outputOfLaborNeed = numberOfHourOfLaber(numberOfSquareFeet);
        double outputOfHourCharges = numberOfHoursCharges(outputOfLaborNeed);
        double outputTotal = TotalCost(outputOfPaintCost, outputOfHourCharges);
        //The number of gallons of paint required
        System.out.println("You need " + outputOfPaint + " gallons of paint ");
        //The cost of the paint
        System.out.println("the cost of paint is $" + outputOfPaintCost);
        // output The hours of labor required
        System.out.println("The number of hours need to do this procject is " + outputOfLaborNeed);
        //output The labor charges
        System.out.println("The total number of hours charges for wage is " + outputOfHourCharges);
        //output The total cost of the paint job
        System.out.println("the total cost is $" + outputTotal);
    }

    public static double numberOfGallonsOfPaint(double numberOfSquareFeet) {
        int gallonsOfPaint = 0;

        while (numberOfSquareFeet > 0) {
            gallonsOfPaint = gallonsOfPaint + 1;
            numberOfSquareFeet = numberOfSquareFeet - 115;
        }
        double numberOfSquareFeetRemainder = numberOfSquareFeet / 115;
        return gallonsOfPaint + numberOfSquareFeetRemainder;
    }

    public static double theCostOfPaint(double outputOfPaint, double priceOfPaintPerGallon) {
        double costOfPaint = outputOfPaint * priceOfPaintPerGallon;
        return costOfPaint;
    }

    public static double numberOfHourOfLaber(double numberOfSquareFeet) {
        int numberOfHours = 0;

        while (numberOfSquareFeet > 0) {
            numberOfHours = numberOfHours + 8;
            numberOfSquareFeet = numberOfSquareFeet - 115;
        }

        double numberOfSquareFeetRemainder = numberOfSquareFeet / 115;
        return numberOfHours + numberOfSquareFeetRemainder;
    }

    public static double numberOfHoursCharges(double outputOfLaborNeed) {
        double hoursCharges = outputOfLaborNeed * 18;
        return hoursCharges;
    }

    public static double TotalCost(double outputOfPaintCost, double outputOfHourCharges) {
        double total = outputOfPaintCost + outputOfHourCharges;
        return total;
    }
}
