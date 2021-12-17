package Chapter3.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(20);
        System.out.printf("Your account balance is: %.2f\n", account.getBalance());
        account.credit(20);
        account.debit(10);
        System.out.printf("Your account balance is: %.2f\n", account.getBalance());
        account.debit(30);
        System.out.printf("Your account balance is: %.2f\n", account.getBalance());


    }

}
