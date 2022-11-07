package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */
public class Ciuntries {
	public static void main(String[] args) {
		TreeSet<String> countries = new TreeSet<>(new LinkedHashSet<>(Arrays.asList("USA", "Canada", "Ukraine",
				"Poland", "Germany", "France", "Spain")));
		
		countries.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		Iterator<String> iterator = countries.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.print(temp + " ");
		}
		
		
		
		
	}
}
