package oops;

class Test1 {
	
	public String toString()
	{
		return "Overrided To String ";
		
	}
}

public class HashCodeReferenceValue {

	public static void main(String[] args) {

		Test1 t = new Test1();
		System.out.println("HASHCODE: " + t.hashCode());
		System.out.println("REFERNCE VALUE: " + t.toString());

	}

}
