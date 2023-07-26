package programs;

public class PrimeNumber {

	static boolean primeNumCheck(int num) {
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i+" divides "+num);
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {

		for (int j = 1; j < 100; j++) {

			boolean status = primeNumCheck(j);

			if (status) {
				System.out.println(j + " is PRIME");
			} else {
				System.out.println(j + " is NOT PRIME");
			}

		}

	}

}
