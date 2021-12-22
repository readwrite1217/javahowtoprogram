package Chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(isMultiple(num2, num1));
    }

    private static boolean isMultiple(int num2, int num1) {
        if (num2 % num1 == 0) {
            return true;
        }
        return false;
    }
}
