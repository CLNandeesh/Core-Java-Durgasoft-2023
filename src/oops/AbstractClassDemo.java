package oops;

abstract class Car {
	int basePrice;

	abstract void maxSpeed();

}

class Maruti extends Car {

	@Override
	void maxSpeed() {
		System.out.println("120 KMPH");

	}

	void marutiCarPrice() {
		System.out.println("20000");
	}

}

class Hyndui extends Car {

	@Override
	void maxSpeed() {
		System.out.println("160 KMPH");

	}

	void hynduiCarPrice() {
		System.out.println("20000");
	}

}

class BMW extends Car {

	@Override
	void maxSpeed() {
		System.out.println("240 KMPH");

	}

	void bmwCarPrice() {
		System.out.println("20000");
	}

}

public class AbstractClassDemo {

	public static void main(String[] args) {
		Maruti maruti=new Maruti();
		maruti.maxSpeed();
		maruti.marutiCarPrice();
		
		
	}

}
