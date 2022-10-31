package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTopic {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Blue");                                    //index 0
		colors.add("White");                                //index 1
		
		System.out.println(colors);                    //way to print list
		colors.forEach(System.out::println);        //other way to print list
		
		for (String color : colors) {        //other way to print list
			System.out.println(color);
		}
		
		System.out.println(colors.get(1));        // get particular element from list by using indexing
		System.out.println(colors.size());        // get length(size) of list
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(32);
		numbers.add(31);
		numbers.add(56);
		
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		ArrayList<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.add('c');
		
		chars.forEach(System.out::println);
		
		ArrayList<Boolean> booleans = new ArrayList<>();
		booleans.add(true);
		booleans.add(false);
		booleans.add(true);
		booleans.add(false);
		booleans.forEach(System.out::println);
		
		ArrayList<Float> floats = new ArrayList<>();
		floats.add(34.5f);
		floats.add(12.2f);
		floats.add(66.54f);
		floats.add(85.4f);
		
		floats.forEach(System.out::println);
		
		ArrayList<String>words = new ArrayList<>(new ArrayList<>(Arrays.asList("word1","word2","word3")));
		//other way to assign val to list
		words.forEach(System.out::println);
	}
}
