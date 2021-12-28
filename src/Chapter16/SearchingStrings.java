package Chapter16;

import java.util.Scanner;

public class SearchingStrings {
    // this is a test
    // t - 3
    // h - 1
    // i - 2
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String line = scanner.nextLine();
        occurence(line.toLowerCase());
    }

    private static void occurence(String string) {


        int upper = Character.getNumericValue('z');
        int lower = Character.getNumericValue('a');
        int[] countAlphabets = new int[upper - lower + 1];
        for (char ch = 'a'; ch <= 'z'; ch++) {


            for (int i = 0; i < string.length(); i++) {
                if (string.indexOf(ch, i) == -1) {
                    break;
                } else {
                    countAlphabets[Character.getNumericValue(ch) - lower]++;
                    i = string.indexOf(ch, i);
                }
            }
        }
        System.out.printf("Alphabets    Count\n");
        for (int i = 0; i < countAlphabets.length; i++) {
            {

                System.out.printf("%9c %5d\n", 'a' + i, countAlphabets[i]);
            }
        }
    }
}
