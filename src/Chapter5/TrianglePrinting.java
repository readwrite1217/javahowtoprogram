package Chapter5;

public class TrianglePrinting {
    public static void main(String[] args) {
        //a
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");

            }
            System.out.println();
        }
        System.out.println();

        //b
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.printf("*");

            }
            System.out.println();
        }
        System.out.println();
        //c

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = i; j < 10; j++) {
                System.out.printf("*");
            }
            System.out.println();

        }
        System.out.println();
        //d

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print('*');
            }
            System.out.println();

        }


    }
}
