package Chapter4;

public class Chapter4_26 {
    public static void main(String[] args) {
        int row = 10;
        int column;

        while (row >= 1) {

            column = 1;
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            } // end while
            --row;
            System.out.println();
        } // end while
    } //
}
