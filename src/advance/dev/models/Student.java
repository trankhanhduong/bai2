package advance.dev.models;

public class Student extends Person{
	double mark;
	public Student(String name, int old, double mark) {
		super(name, old);
		this.mark = mark;
	}
	
	public Student(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}
}