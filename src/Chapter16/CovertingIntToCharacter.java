package Chapter16;

import java.util.Scanner;

public class CovertingIntToCharacter {
    public static void main(String[] args) {
        for (int i = 0; i <= 255; i++) {
//            char c = (char) i;
//            System.out.printf("%d = %c%n", i, c);
            System.out.printf("%d = %c%n", i, i);
        }

    }
}
