package review20Oct;

public class Fruit {
	protected String name;
	String shape;
	private String color;
	
	public static boolean isFresh;
	
	public Fruit(String name, String shape) {
		this.name = name;
	}
	
	Fruit(String name, String shape, String color) {
		this(name, shape);
		this.shape = shape;
		this.color = color;
	}
	
	public void grow() {
		System.out.println("All fruits \ngrow");
	}
	
	protected void haveBenefits() {
		System.out.println("All fruits good for \nyour health");
	}
}


