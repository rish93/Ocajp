package com.ocajp.programs;

public class FIndOutputIntegerPooling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer i1 = new Integer(1);
	        Integer i2 = new Integer(1);


	        System.out.println(i1 != i2);
	        System.out.println(i1 <= i2);
	        System.out.println(i1 >= i2);
		
		/*true
		 * true
		 * true
		 * 
		 * 
		 * reason first since it belong to different heap it is not same memory 
		 * autoboxing happens and 1<=1 result into true
		 * autoboxing happens and 1>=1 result into true
		 * */
	}

}
