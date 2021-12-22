package Chapter6;

import java.util.Scanner;

public class SquareAnyCharacter {
    public static void main(String[] args) {
        int num = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char");
        char fill = scanner.next().charAt(0);
        squareOfAsterisks(num, fill);
    }

    private static void squareOfAsterisks(int i, char c) {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

