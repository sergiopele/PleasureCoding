package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class homework {
	public static void main(String[] args) {
		ArrayList<String>words = new ArrayList<>(new ArrayList<>(Arrays.asList("canoe", "comparison", "travel", "toe", "river")));
		
		words.removeIf(temp -> temp.endsWith("e"));
		//5 words, 2 of them ends with "e"
		words.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		ArrayList<String>drinks=new ArrayList<>(new ArrayList<>(Arrays.asList("Old Fashioned","Margarita","Cosmopolitan","Negroni",
		"Martini","Mojito","Whiskey Sour")));
		Iterator<String> iter = drinks.iterator();
		
		int count=0;
		while(iter.hasNext()) {
			String drink = iter.next();
			
			if(drink.contains("a")|| drink.contains("e")){
				drinks.set(count,"water");
			}
			count++;
		}
		drinks.forEach(System.out::println);
		
		
		
		
	}
}
