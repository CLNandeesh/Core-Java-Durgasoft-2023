package programs;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=22,b=22,c=22;
		if(a>b && a>c)
		{
			System.out.println(a+" is Big");
		}
		else if(b>c)
		{
			System.out.println(b+" is Big");
		}
		else
		{
			System.out.println(c+" is Big");
		}

	}

}
