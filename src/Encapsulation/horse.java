package Encapsulation;

public class horse {
	private String name;
	private String breed;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name.length() > 20) {
			System.out.println("Name canNot contains more than 20 char");
		} else if (name.isEmpty()) {
			System.out.println("Name canNot be empty");
		} else {
			this.name = name;
		}
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		if (breed.isEmpty()) {
			System.out.println("Enter valid breed");
		} else {
			this.breed = breed;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 30) {
			System.out.println("Enter valid age");
		} else {
			this.age = age;
		}
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs) {
		if (numberOfLegs > 4) {
			System.out.println("Enter valid number of legs");
		} else {
			this.numberOfLegs = numberOfLegs;
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (weight > 300) {
			System.out.println("Please enter valid weight");
		} else {
			this.weight = weight;
		}
	}
	
	private int age;
	private int numberOfLegs;
	private double weight;
	
	public horse(String name, String breed, int age, int numberOfLegs, double weight) {
		setAge(age);
		setBreed(breed);
		setName(name);
		setWeight(weight);
		setNumberOfLegs(numberOfLegs);
	}
	
}

class Solution {
	public static void main(String[] args) {
		horse h = new horse("Ragan", "unKnown", 12, 5, 302);
		System.out.println(h.getAge()+" "+h.getNumberOfLegs()+" "+ h.getWeight()+" "+h.getBreed()+" "+h.getName());
	}
}
