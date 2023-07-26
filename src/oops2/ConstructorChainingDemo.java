package oops2;

class P
{
	P()
	{
		System.out.println("Zero");
	}
	
	P(int a)
	{
		this(33.33);
		System.out.println("One");
	}
	
	P(double d)
	{
		this();
		System.out.println("Double");
	}
}
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		P p=new P(11);

	}

}
