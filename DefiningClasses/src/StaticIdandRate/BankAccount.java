package StaticIdandRate;

public class BankAccount {
    private static int id;
    private double balance;
    private static double interestRate = 0.02;
    public int counter;

    public BankAccount() {
        this.counter = this.id++;
    }

    public int getCounter() {
        return counter;
    }

    public static int getId() {
        return id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(double years) {
        return this.balance * interestRate * years;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("You need to enter positive number");
        }
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Account ID" +
                counter +
                " created";
    }
}
