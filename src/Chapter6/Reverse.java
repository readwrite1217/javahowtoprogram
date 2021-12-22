package Chapter6;

public class Reverse {
    public static void main(String[] args) {
        int num = 7631;
        System.out.println(reverse(num));
    }

    private static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int remainder = num % 10; // 3
            reversed = 10 * reversed + remainder; // 1* 10 + 3 = 13
            num /= 10;

        }
        return reversed;
    }
}
