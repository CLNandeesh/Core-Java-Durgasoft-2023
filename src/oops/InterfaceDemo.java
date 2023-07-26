package oops;

import java.util.ArrayList;
import java.util.List;

interface Loan
{

	String  pan = "";
	
	void getLoanAmount(String panNumber);
}

class SBI implements Loan
{

	List<String> list =new ArrayList<String>();
	
	SBI()
	{
		
		list.add("abc123");
		list.add("def123");
		list.add("ghi123");
	}
	@Override
	public void getLoanAmount(String panNumber) {
		
		
		if(list.contains(panNumber))
		{
			System.out.println("Mr "+panNumber+" you are eligible for loan amount 30000");
			System.out.println("************");
		} 
		else
		{
			System.out.println("Mr "+panNumber+" you are not eligible for loan");
			System.out.println("************");
		}
	
		
	}
	
}


class HDFC implements Loan
{

	List<String> list =new ArrayList<String>();
	
	HDFC()
	{
		
		list.add("abc123");
		list.add("def123");
		list.add("xyz123");
	}
	@Override
	public void getLoanAmount(String panNumber) {
		
		
		if(list.contains(panNumber))
		{
			System.out.println("Mr "+panNumber+" you are eligible for loan amount 30000");
			System.out.println("************");
		} 
		else
		{
			System.out.println("Mr "+panNumber+" you are not eligible for loan");
			System.out.println("************");
		}
	
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		SBI s1=new SBI();
		s1.getLoanAmount("ghi123");
		
		SBI s2=new SBI();
		s2.getLoanAmount("xyz123");
		
		HDFC h1=new HDFC();
		h1.getLoanAmount("ghi123");
		
		HDFC h2=new HDFC();
		h2.getLoanAmount("xyz123");

	}

}
