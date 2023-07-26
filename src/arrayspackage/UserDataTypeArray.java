package arrayspackage;

class Student {
	String name;
	int age;
}

public class UserDataTypeArray {

	public static void main(String[] args) {

		Student[] st = new Student[3];

		st[0] = new Student();
		st[1] = new Student();
		st[2] = new Student();

		st[0].name = "APPU";
		st[1].age = 22;
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + "/");
			System.out.print("Name is: " + st[i].name + "/");
			System.out.print("Age is: " + st[i].age + "/");
			
			System.out.println();
		}

	}

}
