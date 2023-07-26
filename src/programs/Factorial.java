package programs;

public class Factorial {

	public static void main(String[] args) {
		
		int n=4,fact=1;
		
		//5 4 3 2 1 
		while(n>0)
		{
			
			fact=fact*n;
			n=n-1;
			
		}
		System.out.println(fact);

	}

}
