package Chapter4;

public class Chapter4_22 {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\t%4d\t%4d\t%4d\n", i, 10 * i, 100 * i, 1000 * i);
        }
    }
}
