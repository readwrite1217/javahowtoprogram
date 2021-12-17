package Chapter3.Account;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        // validate that initial Balance is greater than zero
        // if not intitialize the default value 0.0
        if (initialBalance > 0.0)
            this.balance = initialBalance;

    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public double debit(double amount) {
        if (amount > balance)
            balance -= amount;
        else {
            System.out.printf("Insufficient balance in the account than withdrawal amount: %d", getBalance());
            return 0;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

}
