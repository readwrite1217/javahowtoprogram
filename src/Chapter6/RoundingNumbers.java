package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double in = scanner.nextDouble();
        System.out.println(in);
        System.out.println((int) (Math.floor(in)));
    }
}
