public class workWithArray {
	public static void main(String[] args) {
		Operation op = new Operation();
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println("\nThird largest number is " + op.thirdLargestNumber(a));
		
		int[] duplicate = {1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 0};
		op.duplicateInArray(duplicate);
		
	}
	
}

class Operation {
	public int thirdLargestNumber(int[] arr) {
		int temp = 0;
		int total = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[total - 3];            //searches 3-th largest;
	}
	
	public int duplicateInArray(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(result[i] = arr[j]);
				}
			}
		}
		return 0;
	}
	
}
