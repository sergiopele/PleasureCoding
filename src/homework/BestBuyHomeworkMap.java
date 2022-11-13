package homework;

import java.util.HashMap;
import java.util.Map;

public class BestBuyHomeworkMap {
	public static void main(String[] args) {
		Map<Integer,String>item=new HashMap<>();
		item.put(7664847,"Printer");
		item.put(7624847,"Laptop");
		item.put(7663847,"Keyboard");
		item.put(7664547,"Iphone");
		item.put(7664867,"Mouse");
		item.put(7664347,"Web cam");
		
		for (var items:item.entrySet()
			 ) {
			System.out.println(items);
		}
		
	}
}
