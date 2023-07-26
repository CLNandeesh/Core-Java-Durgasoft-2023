package oops2;

class Testy {
	
	public static Testy testy=null;
	private Testy() {

	}

	void m1() {
		System.out.println("Hai BOSS");
	}

	public static Testy getRef() {
		if(testy==null) {
			testy =new Testy();
		}
		return testy;
	}
}

public class FactoryMethodDesginPattern {

	public static void main(String[] args) {
		Testy t = Testy.getRef();
		System.out.println(t);
		t.m1();
		
		Testy t1 = Testy.getRef();
		System.out.println(t1);
		t1.m1();

	}

}
