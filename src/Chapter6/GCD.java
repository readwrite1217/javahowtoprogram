package Chapter6;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(gcd(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        int gcd = 0;
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        if (max % min == 0) {
            gcd = num1;
        } else {
            for (int i = 2; i <= min; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
