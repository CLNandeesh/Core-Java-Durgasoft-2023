package oops2;

class Employee {
	String ename;
	int eid;

	public Employee(String ename, int eid) {
		this.ename = ename;
		this.eid = eid;
	}

	public void display() {
		System.out.println("Account Information:");
		System.out.println(ename);
		System.out.println(eid);
		System.out.println("*****************");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Appu", 100);
		Employee e2 = new Employee("Sivu", 101);

		e1.display();
		e2.display();

	}

}
