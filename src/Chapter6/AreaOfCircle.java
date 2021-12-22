package Chapter6;

import java.util.Scanner;

public class AreaOfCircle {
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = scanner.nextDouble();
        System.out.println(circleArea(radius));
    }

    private static double circleArea(double radius) {
        return (PI * Math.pow(radius, 2));
    }
}
