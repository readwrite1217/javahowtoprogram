package Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        countwords(string);
//        lengthOfWords(string);
    }

    //to be or not to be
    // be or not to be

    private static void countwords(String string) {
        String[] words = string.split(" ");
        List<String> unique = new ArrayList<>();


        for (int i = 0; i < words.length; i++) {

            if (!unique.contains(words[i])) {
                unique.add(words[i]);
            }
        }
        int[] wordsCount = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].equalsIgnoreCase(unique.get(i)))
                    wordsCount[i]++;
            }


        }
        for (int i = 0; i < unique.size(); i++) {

            System.out.printf("%4s%4d\n", unique.get(i), wordsCount[i]);
        }

    }

    private static void lengthOfWords(String
                                              string) {
        //The longest word in that dictionary is electroencephalographically (27 letters). The longest non-technical word in major dictionaries is floccinaucinihilipilification at 29 letters.
        int[] noOfLetters = new int[30];
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            int count = words[i].length();
            noOfLetters[count]++;
        }
        for (int i = 1; i < noOfLetters.length; i++) {
            System.out.printf("%4d%4d\n", i, noOfLetters[i]);
        }


    }

    private static void occurenceUsingCharAt(String string) {
        int upper = Character.getNumericValue('z');
        int lower = Character.getNumericValue('a');
        int[] countAlphabets = new int[upper - lower + 1];
        for (char ch = 'a'; ch <= 'z'; ch++) {


            for (int i = 0; i < string.length(); i++) {
                int c = string.charAt(i);
                if (c == ch) {
                    countAlphabets[Character.getNumericValue(ch) - lower]++;
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

    private static void occurenceusingStringof
            (String
                     string) {
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
