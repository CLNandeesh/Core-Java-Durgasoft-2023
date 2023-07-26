package oops;

class Testy {
	void add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("SUM is: " + sum);
	}
}

public class VarArgMethodDemo {

	public static void main(String[] args) {

		Testy t = new Testy();
		t.add(10, 20, 30);
		t.add(10);
		t.add();

	}

}
