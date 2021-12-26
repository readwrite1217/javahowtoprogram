package Chapter16;

import java.util.Scanner;

public class ComparingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        if (s.compareTo(s2) > 0) {
            System.out.println("s is greater than s2");
        } else if (s.compareTo(s2) < 0) {
            System.out.println(" s is smaller than s2");
        }else{
            System.out.println("Equal");
        }
    }
}
