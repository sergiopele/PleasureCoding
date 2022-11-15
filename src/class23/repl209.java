package class23;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


class repl209 {
	public static void main(String[] args) {
		
		List<Map<String, Object>> dataList = new LinkedList<>();
		
		Map<String, Object> appleMap = new LinkedHashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10.0);
		
		dataList.add(appleMap);
		
		Map<String, Object> orangeMap = new LinkedHashMap<>();
		
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10.0);
		
		dataList.add(orangeMap);
		
		subTotal(dataList);
		displayList(dataList);
		displayTotal(dataList);
		
	}
	
	public static List<Map<String, Object>> subTotal(List<Map<String, Object>> dataList) {
		double[] total = new double[dataList.size()];
		int count = 0;
		for (Map<String, Object> map : dataList) {
			double price = (double) map.get("Price");
			double quantity = (double) map.get("Quantity");
			total[count] = price * quantity;
			map.put("SubTotal", total[count]);
			count++;
		}
		return dataList;
	}
	
	public static void displayList(List<Map<String, Object>> dataList) {
		for (Map<String, Object> map : dataList
		) {
			System.out.println("Items: " + map.get("Items") + " Price: " + map.get("Price") + " Quantity: " +
					map.get("Quantity") + " Subtotal: " + map.get("SubTotal") + "\n");
			
		}
	}
	
	public static void displayTotal(List<Map<String, Object>> dataList) {
		double total=0;
		for (Map<String, Object> map : dataList
		) {
			total+=(double)map.get("SubTotal");
		}
		System.out.println("Your Purchase total :"+total);
	}
}
