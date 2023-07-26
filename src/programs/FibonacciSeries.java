package programs;

public class FibonacciSeries {

	public static void main(String[] args) {

		int f1 = 0, f2 = 1, f3;
		System.out.print(f1 + " " + f2);

		for (int i = 2; i < 10; i++) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;

		}

	}

}
