
package DefiningClasses;

public class BankAccount {
    private int id;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (0 > amount) {
            throw new IllegalArgumentException();
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        if (this.balance < 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "ID" + this.id + " " + this.balance;
    }

}