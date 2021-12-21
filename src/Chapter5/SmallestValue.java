package Chapter5;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no you want to read");
        int num = scanner.nextInt();
        int count = 1;
        int smallest = 0;
        while (count <= num) {
            int number = scanner.nextInt();
            if (count == 1) {
                smallest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            count++;
        }
        scanner.close();
        System.out.println(smallest);
    }
}
