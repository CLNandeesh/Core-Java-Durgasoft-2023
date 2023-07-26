package programs;

public class LargestOfThreeUsingTernary {

	public static void main(String[] args) {
		int a=22,b=323,c=44;
		
		int big=(a>b?(a>c?a:c):(b>c?b:c));
		System.out.println("Big is: "+big);

	}

}
