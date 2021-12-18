package Chapter4;

import java.util.Scanner;

public class Chapter4_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the side of the square");
        int length = scanner.nextInt();
        int temp = length;
        int breadth;
        while (length >= 1) {
            breadth = 1;
            while (breadth <= temp) {
                if (!(length == 1 || length == temp)) {
                    if (breadth > 1 && breadth < temp) {
                        System.out.print(" \t");
                    }else {
                        System.out.print("*\t");
                    }
                } else
                    System.out.print("*\t");
                ++breadth;
            }
            --length;
            System.out.println();
        }
    }
}
