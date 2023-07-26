package oops;

class Employee1 {
	int eid;
	String ename;
	double esalary;

//	void setData(int eid, String ename, double esalary) {
//		this.eid = eid;
//		this.ename = ename;
//		this.esalary = esalary;
//	}

	void displayData() {
		//System.out.println("********************");
		System.out.println("ENAME: " + ename);
		System.out.println("EID: " + eid);
		System.out.println("ESALARY: " + esalary);
		System.out.println("********************");

	}
}

public class ClassDemo2 {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1();
		//e1.setData(1, "Appu", 2233.33);

		Employee1 e2 = new Employee1();
		//e2.setData(2, "Sivu", 3322.33);

		e1.displayData();

		e2.displayData();

	}

}
