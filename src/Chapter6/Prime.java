package Chapter6;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(isPrime(number));
        int count = 0;
        for (int i = 0; i <= 11; i++) {
            if (isPrime(i
            )) {
                count++;

                System.out.println(i);
            }
        }
        System.out.println("Total no of primes: " + count);
    }

    private static boolean isPrime(int number) {
        if (number <= 0 || number == 1) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;
    }
}
