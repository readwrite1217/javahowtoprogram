package Chapter16;

import java.util.Scanner;

public class ComparingPortionOfStrings {
    public static void main(String[] args) {
        String Str1 = new String("Welcome to Tutorialspoint.com");
        String Str2 = new String("Tutorial");
        String Str3 = new String("TUTORIALS");
        System.out.println(Str1.regionMatches(11, Str2, 0, 9));

    }
}
