package com.Methhods;


public class Methods {
	void print(){
		System.out.println("sdfsdf");
	}
	static boolean isEven(int number){
		return number%2==0;
	}
	
	public static void main(String[] args) {
		Methods obj =new Methods();
		
		System.out.println(obj.isEven(66));
		
		//conditional operator
		int a=2;
		int b=3;
		
		int c=6;
		int d=8;
		
		
		int max = (a > b)? a : b;
		int max3 =(c>d)? c:d;
		int maxMax=(max>max3)?max:max3;
		System.out.println(maxMax);
		
	}
}
