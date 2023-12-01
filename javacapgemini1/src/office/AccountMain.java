package office;

public class AccountMain {

	public static void main(String[] args) {
		Person p1=new Person("naga", 50.0f);
		Person p2=new Person("aniket" ,25f);
		Account a1=new Account(5000.0 , p1);
		Account a2=new Account(2000,p2);
		a1.deposit(4000);
		a2.withdrawl(7000);
		p1.displayPerson();
		a1.displayAccount();
		p2.displayPerson();
		a2.displayAccount();
		a1.deposit(2000);
		a2.deposit(3999);
		a1.getBalance();
		a2.getBalance();		
	}

}
