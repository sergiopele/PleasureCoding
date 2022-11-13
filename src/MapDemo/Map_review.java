package MapDemo;

import java.util.HashMap;

public class Map_review {
	public static void main(String[] args) {
		HashMap<String, Double> items = new HashMap<>();
		items.put("Iphone 14", 1000.0);
		items.put("Eggs", 2.40);
		items.put("Apples", 5.0);
		items.put("Keyboard", 100.0);
		items.put("Flowers", 1.0);
		
		//we want to remove value only in the Map
		//items.values().removeIf(price -> price > 10);
		//items.forEach((s, q) -> System.out.println(s + " " + q));
		/*
		items.forEach((s,q)-> System.out.print(q+" "));
		
		System.out.println("\nusing loop");
		for (Double value:items.values()
			 ) {
			System.out.print(value+" ");
		}
		*/
		items.entrySet().removeIf(s -> s.getKey().contains("e") && s.getValue()>10);
		items.forEach((s, q) -> System.out.println(s + " " + q));
		
		
	}
	
	
}


