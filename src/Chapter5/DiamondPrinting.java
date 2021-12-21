package Chapter5;

public class DiamondPrinting {
    public static void main(String[] args) {
        int row = 19;
        int k = (row + 1) / 2;
        //printing upper
        for (int i = 1; i <= k; i++) {

            for (int j = 1; j <= k - i || j > k + i && j <= k; j++) {
                System.out.print(" ");
            }
            for (int j = k - i + 1; j < k + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //printing lower
        for (int i = k - 1; i >= 1; i--) {

            for (int j = 1; j <= k - i || j > k + i && j <= k; j++) {
                System.out.print(" ");
            }
            for (int j = k - i + 1; j < k + i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

}