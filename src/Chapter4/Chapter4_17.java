package Chapter4;

import java.util.Scanner;

/*
(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by recording the miles driven and gallons used for each tankful. Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the data from the user.
 */
public class Chapter4_17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;
        double averageMileage;
        while (true) {
            System.out.println("Enter the miles for the trip or -1 once done entering all data");
            int miles = scanner.nextInt();
            if (miles == -1) {
                break;
            }
            System.out.println("Enter the gallons for the trip");
            int gallon = scanner.nextInt();
            double mileage = (double) miles / gallon;
            System.out.printf("The mileage for the trip is: %.2f\n", mileage);
            totalMiles += miles;
            totalGallons += gallon;

        }
        scanner.close();
        if (totalMiles != 0) {
            averageMileage = (double) totalMiles / totalGallons;
            System.out.printf("The Average mileage for the trip is: %.2f", averageMileage);
        }
    }


}
