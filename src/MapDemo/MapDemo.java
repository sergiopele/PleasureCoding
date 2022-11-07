package MapDemo;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<>();
		data.put("Username", "Anton123");
		data.put("Password", "pass123");
		System.out.println(data);
		System.out.println(data.containsKey("Username") + "\n" +
				data.containsValue("pass123") + "\n" + data.isEmpty());
		
		LinkedHashMap<String, Double> beautiyProducts = new LinkedHashMap<>();
		beautiyProducts.put("Foundation", 50.5);
		beautiyProducts.put("Blush", 10.5);
		beautiyProducts.put("Lipstick", 8.5);
		
		LinkedHashMap<String, Double> cosmetics = new LinkedHashMap<>();
		cosmetics.put("Soap", 10.5);
		cosmetics.put("Conditioner", 10.4);
		cosmetics.put("Shampoo", 9.2);
		
		LinkedHashMap<String, Double> grocery = new LinkedHashMap<>();
		grocery.putAll(cosmetics);
		grocery.putAll(beautiyProducts);
		System.out.println(grocery);
		
		Set<String>keySet = grocery.keySet();
		System.out.println(keySet);
		var values = grocery.values();
		System.out.println(values);
		
		Iterator<String>iterator = keySet.iterator();
		
		while(iterator.hasNext()){
			String item= iterator.next();
			if(item.contains("n")){
				iterator.remove();
			}
		}
		System.out.println(keySet);
		System.out.println(grocery);
		Set<Map.Entry<String,Double>>entSet=grocery.entrySet();
	}
}
