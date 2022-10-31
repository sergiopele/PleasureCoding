package qq;

import java.util.Scanner;

public class vectorial {
	public static void main(String[] args) {
		System.out.println("Please enter positive number");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = input;
		
		for (int i = input-1; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);
	}
}
