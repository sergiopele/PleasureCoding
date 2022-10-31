package Encapsulation;

public class enccapsulation {
	public static void main(String[] args) {
		Dog tommy = new Dog("Tommy", "German", 10, 23.4);
		tommy.printInfo();
		System.out.println(tommy.getName() + " " + tommy.getBreed() + " " + tommy.getWeight() + " " + tommy.getAge());
	}
	
}

class Dog {
	private String name;    //Set private that nobody can't change value of instance var and via constructor we can assign value
	private String breed;
	private int age;
	private double weight;
	
	
	public Dog(String name, String breed, int age, double weight) {
		setName(name);
		setBreed(breed);
		setAge(age);
		setWeight(weight);
		
	}
	
	void setName(String name) {
		if (name.length() > 30) {
			System.out.println("Name can be more than 30 letters");
		} else if (name.isEmpty()) {
			System.out.println("Name cannot be empty. Please try again");
		} else {
			this.name = name;
		}
	}
	
	void setBreed(String breed) {
		if (breed.length() > 30) {
			System.out.println("Breed can be more than 30 letters");
		} else if (breed.isEmpty()) {
			System.out.println("Breed cannot be empty. Please try again");
		} else {
			this.breed = breed;
		}
	}
	
	void setAge(int age) {
		if (age > 20) {
			System.out.println(("Please use proper age."));
		} else if (age < 0) {
			System.out.println("Age cannot be negative");
		} else {
			this.age = age;
		}
	}
	
	void setWeight(double weight) {
		if (weight > 300) {
			System.out.println("Enter a valid weight");
		} else if (weight < 0) {
			System.out.println("Enter a valid weight");
		} else {
			this.weight = weight;
		}
	}
	
	String getName() {
		return name;
	}
	
	String getBreed() {
		return breed;
	}
	
	int getAge() {
		return age;
	}
	
	double getWeight() {
		return weight;
	}
	
	void printInfo() {
		System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight);
	}
	
}
