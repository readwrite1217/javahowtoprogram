package Chapter4;

import java.util.Scanner;

public class Chapter4_30 {
    public static void main(String[] args) {
//        12321 55555, 45554

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5 digit integer");
        String s = "";
        boolean loop = true;
        while (loop) {
            s = scanner.nextLine();
            if (s.length() == 5) {
                break;
            } else {
                System.out.println("Invalid length! Enter a 5 digit integer");
            }
        }
        int num = Integer.parseInt(s);
        System.out.println(checkPalindrome(num));


    }

    private static boolean checkPalindrome(int num) {

        // reverse the number and check it
        int sum = 0;
        int temp = num;
        int reversed = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversed = sum * 10 + remainder;
            sum = reversed;
            num /= 10;
        }
        if (temp == reversed) {
            return true;
        }
        return false;
    }
}
