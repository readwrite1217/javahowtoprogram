package Chapter5;

public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%10s  %10s", "Integer", "Factorial\n");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%10d   %10d\n", i, findFactorial(i));
        }
    }

    private static long findFactorial(int num) {
        int product = 1;
        while (num >= 1) {
            product *= num;
            num--;
        }
        return product;
    }
}

