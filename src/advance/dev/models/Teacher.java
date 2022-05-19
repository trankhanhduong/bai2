package advance.dev.models;

public class Teacher extends Person {
	
float salary;
	
	public Teacher(String name, int old, float salary2) {
		super(name, old);
		this.salary = salary2;
	}
	
	public Teacher(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}
}