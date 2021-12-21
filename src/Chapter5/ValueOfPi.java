package Chapter5;

public class ValueOfPi {
    private static boolean found = false;

    public static void main(String[] args) {

        int count = 0;
        double pi = 0;
        int i = 1;
        System.out.println("Term   Value of Pi");
        while (count < 20000) {

            if (count % 2 == 0) {
                pi += (double) 4 / i;
            } else {
                pi -= (double) 4 / i;
            }
            count++;
            i = i + 2;
            // check when we get pi = 3.14159
            if (!found && 314159 == (int) (pi * 100000)) {
                System.out.println("The no of terms for the pi value of 3.14159 is: " + count);
                found = true;
            }
            System.out.printf("%4d  %8.6f\n", count, pi);
        }

    }

}
