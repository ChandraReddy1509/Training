package office;

public class Account {
	private long accNumber; 
	private double balance;
	private Person accHolder;
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public Account(double balance,Person accHolder) {
		this.accNumber=(long) (Math.random()*1000);
		this.balance=balance;
		this.accHolder=accHolder;
	}
	public Account(long accNumber,double balance,Person accHolder) {
		this.accNumber=accNumber;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	void deposit(double amount)
	{
		if(amount<0)
		{
		System.out.println("zero amount");
		return;
		}
		balance=balance+amount;
	}
	void withdrawl(double amount) {
		if(amount<0)
		{
			System.out.println("enter the amount to withdrawl");
			return;
		}else if(balance<amount) {
			System.out.println("Insufficiant balance");
			return;
			
		}
		balance=balance-amount;
	}
	void insufficiant(double amount) {
		if(amount==0)
		{
			System.out.println("insufficiant");
			return;
			
		}
		balance=0;
	}
			void displayAccount(){
				System.out.println("accNumber:"+accNumber);
				System.out.println("Balance:"+balance);
				System.out.println("person:"+accHolder.getName());
			}
}
	


