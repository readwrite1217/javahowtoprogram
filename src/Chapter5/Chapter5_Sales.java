package Chapter5;

import java.util.Scanner;

public class Chapter5_Sales {
    public static final double PRODUCT_1 = 2.98;
    public static final double PRODUCT_2 = 4.50;
    public static final double PRODUCT_3 = 9.98;
    public static final double PRODUCT_4 = 4.49;
    public static final double PRODUCT_5 = 6.87;
    public static double totalRetail = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter != -1) {

            System.out.println("Enter the product number: If done press -1");
            int input = scanner.nextInt();
            if (input == -1) {
                displayFinalResults();
                counter = -1;
            } else {
                System.out.println("Enter the quantity of items sold");
                int quantitySold = scanner.nextInt();
                // determine retail price for each product
                double retailForEachProduct = quantitySold * priceForProduct(input);
                System.out.printf("Product  Quantity    RetailPrice\n%7d  %8d  %8   .2f\n", input, quantitySold, retailForEachProduct);
                totalRetail += retailForEachProduct;
            }
        }
    }

    private static void displayFinalResults() {
        System.out.printf("%s%.2f\n", "Total retail sale for the products is: $", totalRetail);
    }

    private static double priceForProduct(int productNumber) {
        double priceForProduct = 0.0;
        switch (productNumber) {
            case 1:
                priceForProduct = PRODUCT_1;
                break;
            case 2:
                priceForProduct = PRODUCT_2;
                break;
            case 3:
                priceForProduct = PRODUCT_3;
                break;
            case 4:
                priceForProduct = PRODUCT_4;
                break;
            case 5:
                priceForProduct = PRODUCT_5;
                break;
        }
        return priceForProduct;
    }
}
