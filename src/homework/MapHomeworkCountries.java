package homework;

import java.util.Map;
import java.util.TreeMap;

public class MapHomeworkCountries {
	public static void main(String[] args) {
		Map<String,String>countries=new TreeMap<>();
		countries.put("Ukraine","Kyiv");
		countries.put("Germany","Berlin");
		countries.put("France","Paris");
		countries.put("Spain","Madrid");
		countries.put("England","London");
		countries.put("Canada","Ottawa");
		
		var iter=countries.entrySet().iterator();
		for (var countr:countries.entrySet()
			 ) {
			System.out.println(countr);
		}
		for (var country:countries.values()
			 ) {
			System.out.println(country);
		}
	}
}
