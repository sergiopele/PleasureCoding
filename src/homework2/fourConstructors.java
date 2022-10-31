package homework2;

public class fourConstructors {
	
	private String name, fullName, country, city;
	
	public fourConstructors(String name, String fullName, String country, String city) {
		this.name = name;
		this.fullName = fullName;
		this.country = country;
		this.city = city;
	}
	
	private void privateprinter() {
		System.out.println(fullName + city + country);
	}
	
	public void publicPrinter() {
		System.out.println(name + country);
	}
	
	void defaultPrinter() {
		System.out.println(city + country);
	}
	
	protected void protectedPrinter() {
		System.out.println(fullName + name + city + country);
	}
	
	public static void main(String[] args) {
		fourConstructors four = new fourConstructors(" Lisa "," Deff "," Canda "," Ottawa ");
		four.privateprinter();
		four.defaultPrinter();
		four.protectedPrinter();
		four.publicPrinter();
	}
	
}
