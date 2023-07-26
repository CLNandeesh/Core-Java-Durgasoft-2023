package oops2;

class B
{
	int i=m1();
	
	int m1()
	{
		System.out.println("M1 method");
		return 10;
	}
	
	B()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("SB");
	}
}
public class InstanceContextDemo {

	public static void main(String[] args) {
		
		B b1=new B();
		System.out.println(b1.i);
		B b2=new B();

	}

}
