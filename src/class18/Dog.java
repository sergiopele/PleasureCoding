package class18;

class Dog extends Animal {
	Dog(String name, String breed, String color) {
		super(name, breed, color);
	}
	
}

class Cat extends Animal {
	
	Cat(String name, String color, String breed, boolean isBarking) {
		super(name, breed, color);
		this.isBarking = isBarking;
		
	}
}

class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("Mosha", "red", "british", false);
		cat.printer();
		System.out.println("Is barking? " + cat.isBarking);
		Dog dog = new Dog("Tyz", "white", "common one");
		dog.printer();
	}
}