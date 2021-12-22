package Chapter6;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        int num = 10;
        squareOfAsterisks(num);
    }

    private static void squareOfAsterisks(int i) {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
