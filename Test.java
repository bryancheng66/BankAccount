public class Test {
	public static void main(String Args[]){
		BankAccount MyAccount = new BankAccount(23551, "psswrd");
		System.out.println("Account ID: " + MyAccount.getAccountID());
		System.out.println("Balance: " + MyAccount.getBalance());	
		MyAccount.setPassword("wrdpss");
		MyAccount.deposit(100);
		System.out.println("Balance: " + MyAccount.getBalance());	
		MyAccount.deposit(-20);	
		System.out.println("Balance: " + MyAccount.getBalance());	

	}
}
