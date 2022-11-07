package Set;
/*
Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */

import java.util.Arrays;
import java.util.HashSet;

public class StudentHW {
	public static void main(String[] args) {
		HashSet<Student>students=new HashSet<>(new HashSet<>(Arrays.asList(new Student("Tommy",1235432),
				new Student("Jack",65422), new Student("Jeff",23432),
				new Student("Anna",1231231))));
		
		students.forEach(s->s.display());
	}
}
class Student{
	String name;
	int studentId;
	
	Student(String name, int studentId){
		this.name=name;
		this.studentId=studentId;
	}
	void display(){
		System.out.println("Student's name: "+name);
	}
}
