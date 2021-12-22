package Chapter6;

import java.util.Scanner;

public class GCDEuclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(gcd(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        boolean gcdFound = false;

        while (!gcdFound) {
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            num1 = max;
            num2 = min;
            System.out.println(max);
            num1 = num1 - num2;
            if (num1 == num2)
                gcdFound = true;
        }
        return num1;
    }
}
