package oops2;

class Pass1
{
	Pass1 getRef()
	{
		return this;
	}
}

class Fail1
{
	
	void m1() {
		System.out.println("FAIL Method");
	}
	
}
public class CurentClassObjectUsingThis2 {

	public static void main(String[] args) {
		
		Pass1 p=new Pass1();
		System.out.println(p);
		
		System.out.println(p.getRef());
		System.out.println(p.getRef());
		
		

	}

}
