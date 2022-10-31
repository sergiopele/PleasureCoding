package class18;

public class Animal {
	String name;
	String breed;
	String color;
	boolean isBarking;
	
	
	Animal(String name,String breed, String color){
		this.name=name;
		this.breed=breed;
		this.color=color;
		
	}
	public void printer() {
		System.out.println("Name " + name + " breed " + breed + " color " + color);
	}
}
