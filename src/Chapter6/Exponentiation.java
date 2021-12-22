package Chapter6;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scanner.nextInt();
        System.out.println("Enter power");
        int power = scanner.nextInt();
        integerPower(num, power);

    }

    private static void integerPower(int num, int power) {
        int product = 1;
        for (int i = 0; i < power; i++) {
            product *= num;
        }
        System.out.println(product);
    }
}
