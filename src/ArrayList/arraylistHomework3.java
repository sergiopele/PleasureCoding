package ArrayList;

import java.util.ArrayList;

public class arraylistHomework3 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		
		for (int i = 0; i <= 500; i++) {
			numbers.add(i);
		}
		numbers.removeIf(s -> s % 2 != 0);
		numbers.removeIf(s -> s % 5 == 0);
		
		numbers.forEach(num -> System.out.print(num + " "));
		
	}
}
