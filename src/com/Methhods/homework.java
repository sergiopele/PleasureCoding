package com.Methhods;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class homework {
	
	public static String getGrade() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(reader.readLine());
		if (score > 90) {
			return "A";
		} else if (score > 80) {
			return "B";
		} else if (score > 70) {
			return "C";
		} else if (score > 50) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter your grade");
		System.out.println(getGrade());
	}
}
