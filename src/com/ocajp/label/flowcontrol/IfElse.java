package com.ocajp.label.flowcontrol;

public class IfElse {

	
	
	public static void main(String[] arg) {
			
				int a = 10;
				if (a++ > 10) {
				System.out.println("true");
				}
				{
				System.out.println("false");
				}
				System.out.println("ABC");
				//false
				//ABC
				
				
				boolean myVal = false;
				if (myVal=true)
				for (int i = 0; i < 2; i++) System.out.println(i);
				else System.out.println("else");
				/*
				  0
				  1*/
				
				
				
				int i = 0;
				for (; i < 2; i=i+5) {
				if (i < 5) continue;
				System.out.println(i);
				}
				System.out.println(i);
				//5
				
				
				
	}
}
