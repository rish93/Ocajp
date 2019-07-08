package com.ocajp.programs;

import java.math.BigDecimal;

public class AmbiguityMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(null);
		print(null);
		checkNumberBigDecimalAmbiguity(null);
		
	}

	/*Ambiguity for setting null which method to be called*/
	public static void display(String first) {
	}
	//on removing one method another then object will be called 
	public static void display(Integer first) {
	}
	
	public static void display(Object second) {
	}
	
	public static void print(Object obj) {
	}
	
	public static void checkNumberBigDecimalAmbiguity(BigDecimal bg) {
		//specific datatype will be called
	}
	public static void checkNumberBigDecimalAmbiguity(Number bg) {
		
	}
	
}
