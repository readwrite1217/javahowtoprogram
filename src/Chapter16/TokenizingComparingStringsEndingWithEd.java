package Chapter16;

import java.util.Scanner;

public class TokenizingComparingStringsEndingWithEd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter string or q to exit");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("q")) {
                break;
            }
            String[] words = s.split(" ");
            for (String word :
                    words) {
                if (word.endsWith("ED")) {
                    System.out.println(word);
                }
            }

        }
    }
}
