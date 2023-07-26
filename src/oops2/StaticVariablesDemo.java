package oops2;

class StaticDemo
{
	static int i=10;
	int j=20;
	
}
public class StaticVariablesDemo {

	static int i=10;
	int j=20;
	
	public static void main(String[] args) {
		
	
		
		StaticDemo s=new StaticDemo();
		System.out.println(s.i);
		
		StaticDemo s1=new StaticDemo();
		s1.i=20;
		System.out.println(s.i);
		
	}

}
