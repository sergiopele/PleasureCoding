package reverseInt;

/*
Write a program that prompts the user to input an integer and then outputs
the number with the digits reversed.
For example, if the input is 12345, the output should be 54321.
 */

import java.util.Scanner;

public class reverseInt {
	private static void reverse(int num) {
		String reverse = Integer.toString(num);
		StringBuilder sb = new StringBuilder(reverse);
		sb = sb.reverse();
		int a = Integer.parseInt(sb.toString());
		System.out.println(a);
	}
	
	private static void reverse2(int num) {
		int reverse = 0;
		while (num != 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter int to reverse");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		reverse(num1); //method1
		reverse2(num1); //method2
		
		
	}
	
}

