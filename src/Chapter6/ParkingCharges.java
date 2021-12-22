package Chapter6;

import java.util.Scanner;

public class ParkingCharges {
    private static final double CHARGE_UPTO_THREE_HOURS = 2.00;
    private static final double CHARGE_PER_HOUR_AFTER_THREE_HOURS = 0.50;
    private static final double MAX_CHARGE = 10.00;
    private static final int MIN_PARK_HOURS = 3;

    public static void main(String[] args) {
        int value = 0;
        double total = 0;
        while (value != -1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the hours parked: -1 once done");
            int hours = Integer.parseInt(scanner.nextLine());
            if (hours == -1) {
                System.out.println("Total charges: " + total);
                break;

            }
            double chargesOnVehicle = calculateCharges(hours);
            System.out.println(chargesOnVehicle);
            total += chargesOnVehicle;

        }
    }

    private static double calculateCharges(int hours) {
        double charge = 0.0;
        if (hours < 0) {
            charge = 0;
        }
        if (hours <= MIN_PARK_HOURS) {
            charge = CHARGE_UPTO_THREE_HOURS;
        }
        if (hours > 3) {
            double someCharge = CHARGE_UPTO_THREE_HOURS + CHARGE_PER_HOUR_AFTER_THREE_HOURS * (hours - MIN_PARK_HOURS);
            if (someCharge > MAX_CHARGE) {
                charge = MAX_CHARGE;
            } else {
                charge = someCharge;
            }
        }
        return charge;
    }
}
