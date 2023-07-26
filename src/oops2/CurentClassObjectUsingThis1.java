package oops2;

class Pass
{
	Fail getRef()
	{
		return new Fail();
	}
}

class Fail
{
	
	void m1() {
		System.out.println("FAIL Method");
	}
	
}
public class CurentClassObjectUsingThis1 {

	public static void main(String[] args) {
		
		Pass p=new Pass();
		System.out.println(p);
		
		System.out.println(p.getRef());
		System.out.println(p.getRef());
		
		p.getRef().m1();

	}

}
