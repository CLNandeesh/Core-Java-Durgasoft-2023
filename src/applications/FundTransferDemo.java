package applications;

import java.util.HashMap;
import java.util.Map;

class Fund {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	Fund() {
		map.put(100, 1000);
		map.put(101, 2000);
		map.put(102, 3000);
		map.put(103, 4000);
	}

	public void funDtransfer(int fromID, int toID, int amount) {
		
		if(map.get(fromID)>=amount)
		{
			map.put(fromID, map.get(fromID) - amount);
			map.put(toID, map.get(toID) + amount);
			System.out.println("Fund transfer is SUCCESS");
			System.out.println(
					"New balance of " + fromID + " is " + map.get(fromID) + " and " + toID + " is " + map.get(toID));

		}
		else
		{
			System.out.println("Insufficient Fund, Please check your balance");
		}
		
	}
}

public class FundTransferDemo {

	public static void main(String[] args) {

		Fund f1 = new Fund();
		f1.funDtransfer(101, 100, 2);

	}

}
