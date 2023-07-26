package oops;

abstract class Test {
	void dispaly() {
		System.out.println("Test Dispaly");
	}
}

class SubTest extends Test {

}

public class AbstractClassROugh {

	public static void main(String[] args) {

		Test t = new SubTest();
		t.dispaly();

	}

}
