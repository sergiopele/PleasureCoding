package Set;
/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class removeA {
	public static void main(String[] args) {
		LinkedHashSet<String>cities = new LinkedHashSet<>(new TreeSet<>(Arrays.asList("Kyiv","Paris","Warsaw",
				"Berlin","London","Madrid","Ankara","Antalia")));
		
		cities.forEach(s -> System.out.print(s+" "));
		cities.removeIf(s->s.startsWith("A"));
		System.out.println();
		cities.forEach(s->System.out.print(s+" "));
	}
}
