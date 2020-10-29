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
	
	public void setPassword(String newPassword){
		this.password = newPassword;
	}	

	public boolean deposit(double amount){
		if (amount >= 0){
			this.balance += amount;
			return true;
		} else {
			return false;
		}
	}
}
