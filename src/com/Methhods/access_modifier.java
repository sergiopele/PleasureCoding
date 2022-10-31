package com.Methhods;

class access_modifier {
	/*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
	Method should be available inside the class only where it was declared and executed by calling it is name.
	 */
	String word = "Word as a parameter";
	
	private static String vowels(String a) {
		return a.replaceAll("[^aeoiu]","");
	}
	
	
	public static void main(String[] args) {
		access_modifier access = new access_modifier();
		System.out.println(access.vowels(access.word));
		
		
	}
}
