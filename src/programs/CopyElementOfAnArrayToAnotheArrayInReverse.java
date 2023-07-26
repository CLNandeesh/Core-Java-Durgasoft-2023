package programs;

public class CopyElementOfAnArrayToAnotheArrayInReverse {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		
		int[] b=new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			b[(a.length-1)-i]=a[i];
		}

		for(int i:b)
		{
			System.out.println(i);
		}
	}

}
