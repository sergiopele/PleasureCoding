import java.util.ArrayList;
import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private String rollNumber;
	
	public Student(String firstName, String lastName, String rollNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", rollNumber='" + rollNumber + '\'' +
				'}';
	}
	//if we don't override this method, java by default check address only
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, rollNumber);
	}
}
class Solution{
	public static void main(String[] args) {
		ArrayList<Student>students=new ArrayList<>();
		students.add(new Student("reqw","wer","342444"));
		students.add(new Student("333w","55wer","342dsdds444"));
		System.out.println();
	}
}
