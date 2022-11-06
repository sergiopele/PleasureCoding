package WrapperClass;

public class WrapperClass {
	public static void main(String[] args) {
		int num = 10;
		Integer wrapperNumber = Integer.valueOf(num);        //(boxing, autoBoxing) converting primitive int ->Integer(non primitive)
		
		int num2 = wrapperNumber.intValue();				//Unboxing, converting non-primitive to primitive
		num2 = wrapperNumber;			                //autoUnboxing
		
	}
}
