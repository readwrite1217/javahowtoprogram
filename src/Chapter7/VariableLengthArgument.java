package Chapter7;

public class VariableLengthArgument {

    public static void main(String[] args) {
        productOfSeries(1, 2, 4, 5);
        productOfSeries(1, 2);
        productOfSeries(1);
        productOfSeries();

    }

    private static void productOfSeries(int... numbers) {
        int product = 1;
        if (numbers.length == 0) {
            product = 0;
        }

        for (int i :
                numbers) {
            product *= i;
        }
        System.out.println(product);
    }
}
