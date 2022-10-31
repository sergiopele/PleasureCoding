package hw11oct;

public class hw {
	public static void main(String[] args) {
		Method m = new Method(3);
		Method m1 = new Method(3,5);
		Method m2 = new Method(3,5,7);
	}
}

class Method {
	Method(int length) {
		System.out.println("this is a square area " + (int)Math.pow(length, 2));
	}
	
	Method(int length, int width) {
		System.out.println("this is rectangle area " + length * width);
	}
	
	Method(int length, int height, int width) {
		System.out.println("this is a box area " + (length*height*width));
	}
}
