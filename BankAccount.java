public class BankAccount {
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int accountID, String password){
		this.balance = 0;
		this.accountID = accountID;
		this.password = password;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public int getAccountID(){
		return this.accountID;
	}
	
	public void setPassword(String newPass){
		this.password = newPass;
	}	

	public boolean deposit(double amount){
		if (amount >= 0){
			this.balance += amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double amount){
		if (amount > 0 && this.balance - amount > 0){
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public String toString(){
		return "#" + this.accountID + "\t" + "$" + this.balance;
	}

	private boolean authenticate(String password){
		return this.password.equals(password);
	}

	public boolean transferTo(BankAccount other, double amount, String password){
		return this.authenticate(password) && this.withdraw(amount) && other.deposit(amount);
	}
}
