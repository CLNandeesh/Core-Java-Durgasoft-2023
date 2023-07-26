package arrayspackage;

import java.util.Arrays;

public class ArraysUtilityClassDemo {

	public static void main(String[] args) {
		
		int a[]= {1,0,3,2,1,55,1,3};
		System.out.println("BS");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		Arrays.sort(a);
		
		System.out.println("AS");
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
