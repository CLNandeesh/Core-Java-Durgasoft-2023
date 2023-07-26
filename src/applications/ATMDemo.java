package applications;

import java.util.HashMap;
import java.util.Map;

class ATM {
	String name;
	int id;
	double balance = 0.0;

	Map<Integer, Double> map = new HashMap<Integer, Double>();

	public void loadBalance() {
		map.put(100, 12345.33);
		map.put(101, 12345.33);
		map.put(102, 12345.33);
		map.put(103, 12345.33);
		map.put(104, 12345.33);
	}

	public void deposit(int id, double amount) {

		balance = balance + amount;
		map.put(id, balance);

		System.out.println("Deposit of amount " + amount + " successfull");
		System.out.println("Your balance is: " + balance);
	}

	public void withdraw(int id, double amount) {
		// this.id = id;
		if (amount <= balance) {
			System.out.println("Withdraw of amount " + amount + " successfull");
			double newBalance = map.get(id) - amount;
			map.put(id, newBalance);

			System.out.println("Your new balance is: " + map.get(id));

		} else {
			System.out.println("Sorry, not enough balance. Your balance amount is: " + map.get(id)
					+ " But you are trying to withdraw " + amount);
		}

	}

}

public class ATMDemo {

	public static void main(String[] args) {

		ATM a1 = new ATM();
		a1.withdraw(100, 6000);
		a1.deposit(100, 5000);
		a1.withdraw(100, 3000);
		
		System.out.println("******************");

		ATM a2 = new ATM();
		a2.deposit(101, 5000);
		a2.withdraw(101, 3000);

	}

}
