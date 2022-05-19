package advance.dev.dao;

import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Person;

public class Manager implements IManager {
	private List<Person> List = new ArrayList<Person>();
	@Override
	public void add(Person p) {
		// TODO Auto-generated method stub\
		List.add(p);
		System.out.println();
	}
	public Person get(int index) {
		return List.get(index);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Person person : List) {
			System.out.println(person);
		}
		
	}
	@Override
	public void findExcellentStudent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findExcellentTeacher() {
		// TODO Auto-generated method stub
		
	}

}