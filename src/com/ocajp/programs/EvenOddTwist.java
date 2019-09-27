package com.ocajp.programs;

public class EvenOddTwist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(isOdd(-3));
	

	//if binary number & withbinary 1 result into 0000
	//& can be used in critical resource
	System.out.println(8&1);
	
	isEvenOddWithBitwise(8);
	isEvenOddWithBitwise(9);
	isEvenOddWithBitwise(10);
	isEvenOddWithBitwise(11);
	
	}

	public static boolean isOdd(int i) {
		
		//always check for numberss's mod ==0 not 1 coz for negative number it will result -1 and result will fail
		return i % 2 == 1;
	}
	
	
	public static boolean isEvenOddWithBitwise(int i) {
		System.out.print(i&1);
		System.out.println("number "+i);
		
		return i % 2 == 1;
	}
}
