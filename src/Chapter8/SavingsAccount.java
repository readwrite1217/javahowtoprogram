package Chapter8;

public class SavingsAccount {
    private static double annualnterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualnterestRate / 12;
    }

    public static void modifyInterestRate(double interestRate) {
        annualnterestRate = interestRate;
    }

    public double getSavingsBalance() {

        return savingsBalance;

    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "savingsBalance=" + savingsBalance +
                '}';
    }
}

class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1);
        System.out.println(saver2);
        System.out.println(saver1.getSavingsBalance());
    }
}
