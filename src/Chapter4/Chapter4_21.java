package Chapter4;

import java.util.Scanner;

/*(Find the Largest Number) The process of finding the largest value is used frequently in com- puter applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the con- test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter- mines and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed).
b) number:The integer most recently input byt the user. c) largest: The largest number found so far.*/
public class Chapter4_21 {

    public static void main(String[] args) {
        int largest = 0;
        int num;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest: " + largest);
    }


}
