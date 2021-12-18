package Chapter4;

import java.util.Scanner;

/*
 *(Sides of a Triangle) Write an application that reads three nonzero values entered by the user and determines and prints whether they could represent the sides of a triangle. */
public class Chapter4_35 {
    public static void main(String[] args) {
        System.out.println("Enter length  of 3 sides of a triangle");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }


    }
}

