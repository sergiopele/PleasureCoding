package review20Oct;

public class Apple extends Fruit {
	String size;
	String taste;
	double price;
	
	Apple(String name, String shape, String color, String size) {
		super(name, shape, color);
		this.size = size;
	}
	
	Apple(String name, String shape, String color, String taste, double price) {
		super(name, shape, color);
		this.taste = taste;
		this.price = price;
	}
	
	void makeJuice(String fruit) {
		System.out.println("Making juice from " + fruit);
	}
	
	void makeJuice() {
		System.out.println("making juice from fruits");
	}
	
	public static void main(String[] args) {
		Apple apple = new Apple("apple", "circle", "red", "big");
		System.out.println(apple.name + "\n" + apple.shape + "\n" + isFresh);
	}
}
