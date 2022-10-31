package thisKeyword;

public class Car {
	String model, make, color;
	int topSpeed;
	double price;
	
	void printer() {
		System.out.println(model + make + color);
	}
}

class BMW extends Car {
	boolean isCheap;
}

class Tesla extends Car {

}

class Toyota extends Car {
	double engine;
}


class carTester {
	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.model = "X6";
		bmw.color = "black";
		bmw.printer();
		
	}
}