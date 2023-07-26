package arrayspackage;

import java.util.Scanner;

public class TwoDJaggedArray {

	public static void main(String[] args) {

		int[][] a = new int[2][];
		a[0] = new int[3];
		a[1] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Enter data"+" ");
				a[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//System.out.print("Details are ");
				System.out.print(a[i][j]+" ");

			}
			System.out.println();

		}

	}

}
