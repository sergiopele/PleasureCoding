package hw21;

public class Student {
	String name;
	int age;
	boolean isStudying;
	
	Student(String name, int age, boolean isStudying) {
		this.name = name;
		this.age = age;
		this.isStudying = isStudying;
	}
	
	void study() {
		System.out.println("is " + name + " studying? " + isStudying);
	}
	
	void getJob() {
		System.out.println("name" + " " + name + " got a job");
	}
	
	public static void main(String[] args) {
		Student[] student = {new SyntaxStudent("Josh", 27, true, 14),
				new Student("Sem", 23, false),
				new CollegeStudent("Luis", 21, true, false),
				new SchoolStudent("Samanta", 15, true, "Smith")};
		for (Student students : student) {
			students.study();
			students.getJob();
		}
	}
	
}

class SyntaxStudent extends Student {
	int batch;
	
	SyntaxStudent(String name, int age, boolean isStudying, int batch) {
		super(name, age, isStudying);
		this.batch = batch;
	}
	
	@Override
	void study() {
		System.out.println("is " + name + " studying? " + isStudying);
	}
	
	void getJob() {
		System.out.println("name:" + " " + name + " didn't get a job.");
	}
	
	
}

class CollegeStudent extends Student {
	boolean isBroken;
	
	CollegeStudent(String name, int age, boolean isStudying, boolean isBroke) {
		super(name, age, isStudying);
		this.isBroken = isBroke;
	}
	
	void study() {
		System.out.println("is " + name + " studying? " + isStudying);
	}
	
	void getJob() {
		System.out.println("name:" + " " + name + " is broke " + isBroken + " and didn't get a job.");
	}
	
}

class SchoolStudent extends Student {
	String lname;
	
	SchoolStudent(String name, int age, boolean isStudying, String lname) {
		super(name, age, isStudying);
		this.lname = lname;
	}
	
	void study() {
		System.out.println("is " + name + " studying? " + isStudying);
	}
	
	void getJob() {
		System.out.println("name: " + " " + name + " " + lname + " you don't need a job.");
	}
	
}