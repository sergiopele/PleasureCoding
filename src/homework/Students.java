package homework;
import homework2.fourConstructors;

public class Students extends fourConstructors {
	
	
	public Students(String name, String fullName, String country, String city) {
		super(name, fullName, country, city);
		
	}
	
	public static void main(String[] args) {
		/*Student john = new Student("John", 34, 45, 67);
		john.credentials();
		john.avarage();
		Student leonard = new Student("Leonard",32,44,68);
		leonard.credentials();
		leonard.avarage();
		Student kim = new Student("Kim",35,37,65);
		kim.credentials();
		kim.avarage();
		Student victoria = new Student("Victoria",37,37,67);
		victoria.credentials();
		victoria.avarage();
		Student oleg = new Student("Oleg",34,32,63);
		oleg.credentials();
		oleg.avarage();
		
		 */
		fourConstructors ten = new fourConstructors(" Ioan ", " Ioan Kim ", " China ", " Shanghai ");
		ten.publicPrinter();
		
	}
}
