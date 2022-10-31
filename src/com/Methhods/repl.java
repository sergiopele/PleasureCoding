package com.Methhods;
class Main {
	
	
	static String surround(String s, String searchTerm){
		String reserve = s.replaceAll(searchTerm,"("+searchTerm+")");
		return reserve;
	}
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
	}
}