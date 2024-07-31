package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String holder, double initialBalance) {
		this.number = number;
		this.holder = holder;
		Deposit(initialBalance);
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public double Deposit(double amount) {
		return this.balance += amount;
	}
	
	public double Withdraw(double amount) {
		return this.balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Account: " 
				+number 
				+ " Holder: "
				+ holder
				+ ", Balance: "
				+ String.format("%.2f%n", balance);
	}
}
