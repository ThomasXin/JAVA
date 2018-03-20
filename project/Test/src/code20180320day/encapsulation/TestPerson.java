package code20180320day.encapsulation;

import sun.management.resources.agent;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setAge(0);
		System.out.println(person.getAge());
	}

}
