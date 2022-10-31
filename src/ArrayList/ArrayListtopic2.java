package ArrayList;

import java.util.ArrayList;

public class ArrayListtopic2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Tymur");
		names.add("Salma");
		names.add("MJ");
		names.add("Josh");
		
		
		names.add(0, "Josh Again");  //add to add new value to lis
		System.out.println(names);
		
		names.set(0, "David");            //set to replace (we don't want shifting) current value on this index (Josh Again)
		
		System.out.println(names);
		
		names.remove("Salma");        //remove - use to delete certain element from a list\
		System.out.println(names);
		
		names.remove(0);            //same way by using index of obj
		System.out.println(names);
		
		
	}
}
