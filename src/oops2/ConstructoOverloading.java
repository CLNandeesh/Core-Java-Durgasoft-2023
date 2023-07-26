package oops2;

class Temp {
	Temp() {
		System.out.println("Zero");
	}

	Temp(int i) {
		System.out.println("One");
		System.out.println(i);
	}
	
	Temp(int i,String s) {
		System.out.println("Two");
	}
}

public class ConstructoOverloading {

	public static void main(String[] args) {

		Temp t2 = new Temp(11);
		Temp t3 = new Temp();
		Temp t4 = new Temp(11,"appu");

	}

}
