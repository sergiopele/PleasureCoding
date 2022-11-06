/*
Write a Java program to reverse the element of an integer 1-D array.
 */

import java.util.Scanner;

public class evenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(isOddEven(scan.nextInt()));
		
		
	}
	static String isOddEven(int a){
		
		return (a!=0)?(a%2==0)? "num is even":"num is odd":"number is 0";
	}
	
	
}







