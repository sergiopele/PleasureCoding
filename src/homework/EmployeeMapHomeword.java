package homework;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeMapHomeword {
	public static void main(String[] args) {
		Map<Integer, Person> employee = new TreeMap<>();
		employee.put(15345673, new Person("Alex", "Smith", 25, 120000.0));
		employee.put(12364211, new Person("Adam", "Foo", 32, 130000.0));
		employee.put(10125673, new Person("Inga", "Lee", 29, 125000.0));
		employee.put(14112456, new Person("Rafael", "Rez", 35, 150000.0));
		
		employee.forEach((s,q) -> System.out.println("empID: "+s+" - "+q));
	}
}

class Person {
	private String name;
	private String lastName;
	private int age;
	private double salary;
	
	Person(String name, String lastName, int age, double salary) {
		setName(name);
		setLastName(lastName);
		setAge(age);
		setSalary(salary);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
