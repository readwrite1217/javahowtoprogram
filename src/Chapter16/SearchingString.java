package Chapter16;

import java.util.Scanner;

public class SearchingString {
    public static void main(String[] args) {
        char c = 'c';
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        countOccurences(s, c);

    }

    private static void countOccurences(String s, char c) {
        int occurence = 0;
        System.out.println(s.indexOf(c));
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(c) == -1) {
                break;
            } else {
                occurence++;
                i = s.indexOf(c, i);
            }
        }
        System.out.println(occurence);
    }
}

