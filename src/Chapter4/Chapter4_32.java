package Chapter4;

public class Chapter4_32 {
    public static void main(String[] args) {
        int row = 8;

        while (row >= 1) {
            int column = 8;
            if (row % 2 != 0)
                System.out.print(" ");
            while (column >= 1) {
                System.out.print("* ");
                column--;
            }
            System.out.println();
            row--;
        }
    }
}
