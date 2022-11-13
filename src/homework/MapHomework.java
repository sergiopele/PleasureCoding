package homework;

import java.util.HashMap;
import java.util.Map;

public class MapHomework {
	public static void main(String[] args) {
		Map<Integer,String>floor=new HashMap<>();
		floor.put(1,"Asus");
		floor.put(2,"Google");
		floor.put(3,"Syntax");
		floor.put(4,"Logitech");
		floor.put(4,"Amazon");
		floor.put(5,"Apple");
		floor.put(6,"Microsoft");
		floor.put(7,"Samsung");
		
		System.out.println(floor.keySet().size());
		for (var a:floor.entrySet()
			 ) {
			System.out.print(a+" ");
		}
		
		floor.replace(4,"Sony");
		floor.remove(7);
		floor.forEach((g,s)-> System.out.println(g+" "+s));
		
		
	}
}
