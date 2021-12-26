package Chapter16;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        printLatinWord(sentence);
    }

    private static void printLatinWord(String sent) {
        String[] words = sent.split(" ");
        for (String word :
                words) {
            System.out.print(String.format("%s ", word.substring(1).concat(word.substring(0, 1)).concat("ay")));
        }
    }
}
