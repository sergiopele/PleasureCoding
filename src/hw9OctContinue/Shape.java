package hw9OctContinue;

public class Shape {
	int radius;
	
	Shape(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle shape = new Circle(4);
		shape.areaOfCircle();
	}
	
}

class Circle extends Shape {
	double area;
	final double PI = 3.14;
	
	Circle(int radius) {
		super(radius);
	}
	
	void areaOfCircle() {
		
		System.out.println(area = PI * Math.pow(radius, 2));
	}
}