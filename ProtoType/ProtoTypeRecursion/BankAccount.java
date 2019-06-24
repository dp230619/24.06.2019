
public class BankAccount implements ProtoType<BankAccount>{
	
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public BankAccount clone()
	{
		return new BankAccount(balance);
	}

}
