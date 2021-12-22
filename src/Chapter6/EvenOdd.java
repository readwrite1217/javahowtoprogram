package Chapter6;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
