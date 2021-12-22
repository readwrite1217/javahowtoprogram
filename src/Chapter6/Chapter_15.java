package Chapter6;

import java.util.Scanner;

public class Chapter_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        System.out.println(calcHypotenuse(side1, side2));
    }

    private static double calcHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
