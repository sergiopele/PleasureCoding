package Clock;

import java.util.Scanner;

public class Clock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum = number;
		for (int i = number-1; i > 0; i--) {
			sum *= i;
			
		}
		System.out.println(sum);
	}
}
