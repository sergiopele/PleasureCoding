package homework;

public class Student {
	
	private String name;
	private int grade1, grade2, grade3;
	
	
	public Student(String name, int grade1, int grade2, int grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		
	}
	
	public int avarage() {
		int result = (grade1 + grade2 + grade3) / 3;
		System.out.println("Avarage is "+result);
		return result;
	}
	
	void credentials(){
		System.out.println("Student "+name+" has got next scores "+ grade1+" "+grade2+" "+grade3);
	}
	
	
}
