package Chapter7;

import java.util.Scanner;

public class AirlineReservationSystem {
    private static boolean[] seats = new boolean[10];
    private static Scanner scanner = new Scanner(System.in);
    private static final String FIRST_CLASS = "F";
    private static final String ECONOMY_CLASS = "E";

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nType 1 for First Class and 2 for Economy\n");
            int num = scanner.nextInt();
            if (num == 1) {
                assignSeatFirstClass();
            } else {
                assignSeatEconomyClass();
            }
        }
    }

    private static void assignSeatEconomyClass() {
        boolean seatAssigned = false;
        int assignedSeat = 0;
        for (int i = 5; i < 10; i++) {
            if (!seats[i]) {
                seats[i] = true;
                assignedSeat = i;
                seatAssigned = true;
                break;
            }
        }
        if (!seatAssigned) {
            if (checkFirstClass()) {
                System.out.print("No seats available in Economy Class. Are you ok to be placed in First Class: Press 1 for YES 0 for NO");
                int num = scanner.nextInt();
                if (num == 1) {
                    assignSeatFirstClass();
                } else {
                    System.out.printf("Next flight leaves in 3 hours\n");
                }
            } else {
                System.out.printf("Next flight leaves in 3 hours");
            }

        } else {
            displayBoarding(assignedSeat, ECONOMY_CLASS);
        }

    }

    private static boolean checkFirstClass() {
        for (int i = 0; i < 5; i++) {
            if (!seats[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkEconomyClass() {
        for (int i = 5; i < 10; i++) {
            if (!seats[i]) {
                return true;
            }
        }
        return false;
    }

    private static void assignSeatFirstClass() {
        boolean seatAssigned = false;
        int assignedSeat = 0;
        for (int i = 0; i < 5; i++) {
            if (!seats[i]) {
                seats[i] = true;
                seatAssigned = true;
                assignedSeat = i;
                break;
            }
        }
        if (!seatAssigned) {
            if (checkEconomyClass()) {
                System.out.println("No seats available in First Class. Are you ok to be placed in Economy Class? Press 1 for YES 0 for NO");
                int num = scanner.nextInt();
                if (num == 1) {
                    assignSeatEconomyClass();
                } else {
                    System.out.printf("Next flight leaves in 3 hours");
                }

            } else {
                System.out.printf("Next flight leaves in 3 hours");
            }
        } else {
            displayBoarding(assignedSeat, FIRST_CLASS);
        }
    }

    private static void displayBoarding(int assignedSeat, String flightClass) {
        System.out.printf("%s   %d\n", flightClass, assignedSeat + 1);
    }
}
