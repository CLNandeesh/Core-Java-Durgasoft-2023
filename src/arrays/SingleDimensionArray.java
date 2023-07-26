package arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		/*
		 * String [] str= {"aaa","bbb","ccc"};
		 * 
		 * 
		 * str[3]="ddd";
		 * 
		 * for(String s:str) { System.out.println(s); }
		 */

		int[] a=new int[3];
		a[0]=10;
		a[1]=22;
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		System.out.println(a);
	
	}

}
