package arrayspackage;

import java.util.Scanner;

public class ArraysIntro {

	public static void main(String[] args) {

		int[] ar = new int[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {
			System.out.println("Kindly enter marks of " + i + " student");
			ar[i] = sc.nextInt();
		}

		int totalMarks = 0;

		for (int i = 0; i < ar.length; i++) {
			totalMarks = totalMarks + ar[i];
		}

		System.out.println("Total Marks is: " + totalMarks);
		
		for(int a:ar)
		{
			System.out.print("Marks are: "+a+"  ");
		}

	}

}
