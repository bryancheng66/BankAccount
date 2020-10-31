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
		MyAccount.withdraw(200);
		System.out.println("Balance: " + MyAccount.getBalance());	
		MyAccount.withdraw(20);
		System.out.println("Balance: " + MyAccount.getBalance());	
		System.out.println(MyAccount.toString());

		BankAccount AccountA = new BankAccount(12366, "pword");
		BankAccount AccountB = new BankAccount(245253, "qword");
		AccountA.transferTo(AccountB, -10, "pword");
		AccountA.transferTo(AccountB, 50, "pword");
		AccountB.transferTo(AccountA, 20, "qwrod");
		System.out.println("AccountA \nBalance " + AccountA.getBalance());
		System.out.println("AccountB \nBalance " + AccountB.getBalance());

		AccountA.deposit(200);
		AccountA.transferTo(AccountB, -10, "pword");
		AccountA.transferTo(AccountB, 50, "pword");
		AccountB.transferTo(AccountA, 20, "qword");
		System.out.println("AccountA \nBalance " + AccountA.getBalance());
		System.out.println("AccountB \nBalance " + AccountB.getBalance());	
	}
}
