package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class homework {
	public static void main(String[] args) {
		var words = new ArrayList<>(new ArrayList<>(Arrays.asList("canoe", "comparison", "travel", "toe", "river")));
		
		words.removeIf(temp -> temp.endsWith("e"));
		//5 words, 2 of them ends with "e"
		words.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		ArrayList<String>drinks=new ArrayList<>(new ArrayList<>(Arrays.asList("Old Fashioned","Margarita","Cosmopolitan","Negroni",
		"Martini","Mojito","Whiskey Sour")));
		var iter = drinks.iterator();
		
		int count=0;
		while(iter.hasNext()) {
			var drink = iter.next();
			
			if(drink.contains("a")|| drink.contains("e")){
				drinks.set(count,"water");
			}
			count++;
		}
		drinks.forEach(System.out::println);
		
		
		
		
	}
}