package oops2;

class Static
{
	
	Static()
	{
		System.out.println("Constructor");
	}
	int i=10;
	static int j=m1();
	
	static
	{
		System.out.println("Static Block");
	}
	
	static int m1()
	{
		System.out.println("M1 method");
		return 100;
	}
	
	{
		System.out.println("Instance bLock");

	}
}
public class StaticCOntextDemo {

	static int i=m2();
	static int m2()
	{
		System.out.println("M2 - Main class");
		return 10;
	}
	
	int k=m3();
	int m3()
	{
		System.out.println("M3 - Main class");
		return 10;
	}
		
	public static void main(String[] args) {
		Static s1=new Static();
		Static s2=new Static();
		
		StaticCOntextDemo c=new StaticCOntextDemo();

	}

}
