package oops2;

class Demo
{
	int i=m1();
	

	
	int m1()
	{
		System.out.println("m1");
		return 10;
	}
	static
	{
		System.out.println("Byte code Loading");
	}
	
	Demo()
	{
		System.out.println("Constructor Loading");
	}
}
public class ClassForNameMethodDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c=Class.forName("oops2.Demo");
		Object obj=c.newInstance();
		
		
		System.out.println(c.getPackageName());
		System.out.println(c.getConstructors());
		System.out.println(c.getName());

	}

}
