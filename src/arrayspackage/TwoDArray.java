package arrayspackage;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("Enter "+i+"  "+j+" student detail");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int a[] : arr) {
			System.out.print("Students are " + "  ");
			for (int x : a) {
				System.out.print(x + " ");
			}
		}

	}

}
