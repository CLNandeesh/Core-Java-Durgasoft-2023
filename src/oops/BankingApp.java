package oops;

class BankClass {
	/*
	 * 
	 * Bank Class Name/ID/Balance
	 * 
	 * create customer and assign id deposit withdraw
	 * 
	 */
	String name;
	int ID;
	double balance;
	int count=1;
	
	BankClass()
	{
		
		ID=count;
		count++;
	}
	
	
}

public class BankingApp {

	public static void main(String[] args) {
		
		BankClass b1=new BankClass();
		System.out.println(b1.ID);
		
		BankClass b2=new BankClass();
		System.out.println(b2.ID);
		
		
	}

}
