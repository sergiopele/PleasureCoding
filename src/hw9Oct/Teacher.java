package hw9Oct;

class Teacher {
	String name, lastName;
	int id, age;
	double salary;
	
	Teacher(String name, String lastName, int id, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
}

class MathTeacher extends Teacher {
	
	MathTeacher(String name, String lastName, int id, int age, double salary, int legs, int ears) {
		super(name, lastName, id, age, salary);
	}
}

class ChemistryTeacher extends Teacher {
	
	ChemistryTeacher(String name, String lastName, int id, int age, double salary, int eyes, boolean hasHair) {
		super(name, lastName, id, age, salary);
	}
}

class PianoTeacher extends Teacher {
	
	PianoTeacher(String name, String lastName, int id, int age, double salary, boolean hasFingers) {
		super(name, lastName, id, age, salary);
	}
}