package oops;

public class MutableImmutableObjects {

	public static void main(String[] args) {

		String s1 = new String("Appu");
		System.out.println(s1.hashCode());
		System.out.println((s1.concat("Raj")).hashCode());
		
		System.out.println("********************");

		StringBuffer sb1 = new StringBuffer("Appu");
		System.out.println(sb1.hashCode());
		System.out.println((sb1.append("Raj")).hashCode());

	}

}
