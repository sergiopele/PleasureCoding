package IteratorClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>(new ArrayList<>(Arrays.asList("rocker","world")));
		Iterator<String>iterator= names.iterator();
		
		//has.next() it checks if there is any item present
		
		//names.removeIf(item -> item.endsWith("r"));		//functionality operator instead of while loop
		//names.forEach(System.out::println);
		
		while(iterator.hasNext()){
			String item = iterator.next();		//very important coz it does not call has.next()two times
			if(item.endsWith("r")){
				iterator.remove();
			}
		}
		names.forEach(System.out::println);
	}
}
