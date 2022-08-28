package entities;

public class Holder {
	
	public int number;
	public String name;
	public double balance;
	
	public Holder(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account Data: \n"
				+ "Account "
				+ number
				+ " Holder : "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
