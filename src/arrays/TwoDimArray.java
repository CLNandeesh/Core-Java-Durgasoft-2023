package arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int [][] a= {{1,2,3},{4,5,6}};
		
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[1][1]);
		//System.out.println(a[4][3]);
		
		System.out.println("****************");
		for(int[] i:a)
		{
			for(int j:i)
			{
				System.out.print(j);
				System.out.print(" ");
			}
		}
		
		
	}
	

}
