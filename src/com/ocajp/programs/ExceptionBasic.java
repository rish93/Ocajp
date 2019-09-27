package com.ocajp.programs;

import java.io.IOException;

public class ExceptionBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		exceptionMethod();
		System.out.println("end");
	}

	
	public static void exceptionMethod() {
		int arr[]= new int[1];
		try {
			
		}
		catch(Exception e) {
			
		}
		finally {
			
	//		How you handle exception if exception comes in Finally block  
			//by try catch inside finally or
			///calling method have try cathch
			try {
			arr[1]=arr[4];
			}catch(Exception e) {
				
			}
		}
		
		
	//	throw new NullPointerException();
		//throw new IOException();
	}
	
	
}
