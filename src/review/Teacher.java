package review;

public class Teacher {
	String name, lname;
	String subject;
	int experience;
	double salary;
	
	public static String school;
	
	Teacher(String name, String lname) {
		this.name = name;
		this.lname = lname;
	}
	
	Teacher(String name, String lname, String subject) {
		this(name, lname);
		this.subject = subject;
	}
	
	Teacher(String name, String lname, int experience) {
		this(name, lname);
		this.experience = experience;
	}
	
	void print() {
		System.out.println("Teacher name " + name + " " + lname);
	}
	
	void teach() {
		this.print();
		System.out.println(name + " teachers " + subject);
	}
	
	static void work() {
		System.out.println("All teachers work at " + school);
	}
	
	protected double getBonus() {
		if (experience < 5) {
			return 3;
		} else {
			return 3.5;
		}
	}
}

class School {
	public static void main(String[] args) {
		Teacher t = new Teacher("John", "Smith");
		Teacher t1 = new Teacher("Jane", "Smith", "Biology");
		Teacher t2 = new Teacher("Jack", "Smith", 5);
		t1.teach();
		Teacher.school = "Syntax";
		Teacher.work();
		
	}
}