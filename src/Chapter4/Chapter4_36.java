package Chapter4;

import java.util.Scanner;

public class Chapter4_36 {
    public static void main(String[] args) {
        // for a right triangle, the square of the longest side should be equal to the square of the remaining two
        System.out.println("Enter length  of 3 sides of a triangle");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        // do else if otherwise
        if ((sideA * sideA + sideB * sideB == sideC * sideC) || (sideA * sideA + sideC * sideC == sideB * sideB) || (sideC * sideC + sideB * sideB == sideA* sideA)) {
            System.out.println("Right angle");
        } else {
            System.out.println("Not right angle");
        }
    }
}
