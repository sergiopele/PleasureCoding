package hwArrayList;
/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */

import java.util.ArrayList;
import java.util.Arrays;

public class hw {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Ben", "John", "David", "Adem", "Anthony"));
		System.out.println("Is current ArrayList empty: " + names.isEmpty());
		System.out.println("Is current ArrayList contains name 'John': " + names.contains("John"));				//present in the list
		System.out.println("Is current ArrayList contains name 'Andrea': " + names.contains("Andrea"));			//not present in the list
		System.out.println("Size of current ArrayList: " + names.size());
		names.forEach(System.out::println);
		
	}
}
