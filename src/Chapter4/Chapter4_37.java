package Chapter4;

import java.util.Scanner;

public class Chapter4_37 {
    public static void main(String[] args) {
        //factorial without recursion

        // 5 ! = 120

        // 5 * 4* 3* 2* 1
        System.out.println("Press F for factorial, E for constant e and Q to quit");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        if (ch.equalsIgnoreCase("q")) {
            System.out.println("Exiting app");
            System.exit(-1);
        }
        if (ch.equalsIgnoreCase("F")) {
            System.out.println("Enter integer no: ");
            int num = sc.nextInt();
            System.out.println("Factorial is: " + findFactorial(num));
        }
        if (ch.equalsIgnoreCase("E")) {
            System.out.println("Enter no of terms to calculate for: ");
            int num = sc.nextInt();
            System.out.println(calculateConstantE(num));
        }

    }

    private static double calculateConstantE(int num) {
        double sum = 1;
        while (num >= 1) {
            int denominator = findFactorial(num);
            sum += (double) 1 / denominator;
            num--;
        }
        return sum;
    }

    private static int findFactorial(int num) {
        int product = 1;
        while (num >= 1) {
            product *= num;
            num--;
        }
        return product;
    }

}
