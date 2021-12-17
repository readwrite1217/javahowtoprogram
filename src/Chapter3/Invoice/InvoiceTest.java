package Chapter3.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("ABC12", "Wheel", 2, 40.0);
        System.out.printf("The total amount due is: %.2f\n", invoice.getInvoiceAmount());
        Invoice invoice1 = new Invoice("ABC12", "Wheel", 0, 80.00);
        System.out.printf("The total amount due is: %.2f\n", invoice1.getInvoiceAmount());
        //add getter to print rest if needed
    }

}
