package arrayspackage;

class A {

}

class B {

}

public class ObjectTypeArray {

	public static void main(String[] args) {
		Object[] obj = new Object[2];
		obj[0] = new A();
		obj[1] = new B();

	

	for (int i = 0; i < obj.length; i++) {
		System.out.print(obj[i] + "/");
		
		System.out.println();
	}
}}