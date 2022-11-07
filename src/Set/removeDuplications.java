package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplications {
	public static void main(String[] args) {
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		HashSet<String>removeDuplicates =  new HashSet<>(aList);
		System.out.println("Before");
		aList.forEach(s-> System.out.print(s+" "));
		System.out.println("\n"+"After");
		removeDuplicates.forEach(s-> System.out.print(s+" "));
		
	}
}
