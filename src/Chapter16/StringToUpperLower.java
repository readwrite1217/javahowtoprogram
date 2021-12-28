package Chapter16;

import java.util.Scanner;

public class StringToUpperLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
