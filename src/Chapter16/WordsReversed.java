package Chapter16;

import java.util.Scanner;

public class WordsReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = scanner.nextLine();
        reverse(s);
    }

    private static void reverse(String s) {
        String[] words = s.split(" ");
 /*
      char reversed with words
      StringBuilder sb = new StringBuilder();
        for (String word :
                words) {
//            StringBuilder sb = new StringBuilder();
//            System.out.println(sb.reverse().toString());
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            sb.append(reversed).append(" ");
        }
        System.out.printf("%s", sb.toString());
    }*/

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}



