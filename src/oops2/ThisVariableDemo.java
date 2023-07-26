package oops2;

class X
{
	int i=10;
	int j=20;
	
	X(int i)
	{
		int j=30;
		System.out.println(i);
		System.out.println(j);
		System.out.println(this.i);
		System.out.println(this.j);
	}
}
public class ThisVariableDemo {

	public static void main(String[] args) {
		X x=new X(40);

	}

}
