package oops;

class Bank {
	int accId;
	String accHolderName;
	String acctType;
	double balance;

	void setData(int aid, String name, String type, double balance) {
		accId = aid;
		accHolderName = name;
		acctType = type;
		this.balance = balance;
	}

	void dispaly() {
		System.out.println("**********");
		System.out.println("Name: " + accHolderName);
		System.out.println("ID: " + accId);
		System.out.println("Acct Type: " + acctType);
		System.out.println("Balance: " + balance);
		System.out.println("**********");
	}

}

public class BankClassDemo {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		c1.setData(100, "Appu", "Saving",222.33);
		c1.dispaly();

	}

}
