package defineBankAccountClass;

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
		if (amount < 0) {
			throw new IllegalArgumentException("Amount should be non-negative");
		}
		this.balance += amount;

	}

	public void withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount should be non-negative");
		}
		this.balance -= amount;

	}

	@Override
	public String toString() {
		return "ID" + this.balance;
	}

}
