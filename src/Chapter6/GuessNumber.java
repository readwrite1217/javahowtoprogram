package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(1000);
        System.out.println("Guess a number between 1 and 1000");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int countGuesses = 0;
        while (random != input) {
            if (input < random)
                System.out.println("Too low, Try again");
            else
                System.out.println("Too high , Try again");
            input = scanner.nextInt();
            countGuesses++;
        }
        System.out.println("Congratulations. You guessed the number");
        if (countGuesses < 10)
            System.out.println("Either you know the secret or you got lucky!");
        else if (countGuesses == 10)
            System.out.println("Aha! You know the secret!");
        else
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
    }
}
