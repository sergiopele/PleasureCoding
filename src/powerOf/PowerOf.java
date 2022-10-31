package powerOf;

import java.util.Scanner;

/*
Two numbers are entered through the keyboard.
Write a program to find the value of one number raised to the power of another.
(Do not use Java built-in method)

 */

public class PowerOf {
	public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int num=scan.nextInt();
	int numPow = scan.nextInt();
	int result = 1;
	for(int i=0;i<numPow;i++){
		result*=num;
	}
		System.out.println(result);
	
		
	}
}
