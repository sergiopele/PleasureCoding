package Set;

import java.util.ArrayList;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Set {
	public static void main(String[] args) {
		ArrayList<Insurance> insurances = new ArrayList<>();
		insurances.add(new Car("Car Insurance","BMW"));
		insurances.add(new Pet("Pet insurance","Dog"));
		insurances.add(new Health("Health insurance"));
		
		for (Insurance insurance : insurances
		) {
			insurance.getQuote();
			insurance.cancelInsurance();
		}
	}
}

abstract class Insurance {
	String insuranceName;
	
	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	abstract void getQuote();
	
	abstract void cancelInsurance();
}

class Car extends Insurance {
	String InsuranceName;
	String carModel;
	
	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}
	
	@Override
	void getQuote() {
		System.out.println("this is "+insuranceName+ " Quote method");
	}
	
	@Override
	void cancelInsurance() {
		System.out.println("this is "+carModel+" cancel Method");
	}
}

class Pet extends Insurance {
	
	String InsuranceName;
	String petType;
	
	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}
	
	@Override
	void getQuote() {
		System.out.println("this is "+insuranceName+" method");
	}
	
	@Override
	void cancelInsurance() {
		System.out.println("this is " +petType+" cancel method");
	}
}

class Health extends Insurance {
	String InsuranceName;
	
	Health(String insuranceName) {
		super(insuranceName);
		
	}
	
	@Override
	void getQuote() {
		System.out.println("this is "+insuranceName+" Quote method");
	}
	
	@Override
	void cancelInsurance() {
		System.out.println("this is "+insuranceName+ "cancel method");
	}
}
