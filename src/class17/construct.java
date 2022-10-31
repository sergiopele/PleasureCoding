package class17;

public class construct {
	private String name, fullName;
	static String race = "human";
	private int age, high;
	
	
	public construct(String name, String fullName, int age, int high) {
		this.name = name;
		this.fullName = fullName;
		this.age = age;
		this.high = high;
		
		
	}
	
	public construct() {
	}
	
	void printer() {
		System.out.println(name + " " + fullName + " " + age + " " + high);
		
	}
}
