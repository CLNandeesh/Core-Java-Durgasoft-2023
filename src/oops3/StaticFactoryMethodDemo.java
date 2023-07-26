package oops3;

class A {
	private A() {
		System.out.println("Const");
	}

	void disp() {
		System.out.println("Display method");
	}

	static A a = null;

	static {
		a = new A();
	}

//	static A getRef() {
//		if (a == null) {
//			a = new A();
//		}
//
//		return a;
//	}

	static A getRef() {
		return a;
	}
}

public class StaticFactoryMethodDemo {

	public static void main(String[] args) {

		// A a = A.getRef();
		// System.out.println(a);
		A a = A.getRef();
		a.disp();

		// A b = A.getRef();
		// System.out.println(b);

	}

}
