public class WrapperClass {
	public static void main(String[] args) {
		int num = 10;
		Integer wrapperNumber = Integer.valueOf(num);        //(boxing, autoBoxing) converting primitive int ->Integer(non primitive)
		
		int num2 = wrapperNumber;				//autoUnboxing, converting non-primitive to primitive
		
	}
}
