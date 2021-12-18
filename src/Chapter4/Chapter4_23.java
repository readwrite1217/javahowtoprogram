package Chapter4;

import java.util.Scanner;

/*(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find the two largest values of the 10 values entered. [Note: You may input each number only once.]*/
public class Chapter4_23 {
    public static void main(String[] args) {

        int largest = 0;
        int secondLargest = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                int num = scanner.nextInt();
                if (num > largest) {
                    largest = num;
                }
            } else {
                int temp = scanner.nextInt();
                if (temp > largest) {
                    secondLargest = largest;
                    largest = temp;
                } else if (temp > secondLargest) {
                    secondLargest = temp;
                }
            }
        }
        System.out.println(secondLargest);
        System.out.println(largest);

    }
}
