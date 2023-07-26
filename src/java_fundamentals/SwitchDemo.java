package java_fundamentals;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int num=1;
		
		switch(num)
		{
		case 1:
		{
			System.out.println("ONE");
			break;
		}
		case 2:
		{
			System.out.println("TWO");
			break;
		}
		
		case 3:
		{
			System.out.println("THREE");
			break;
		}
		default:
		{
			System.out.println("INVALID");
		}
		
		}

	}

}
