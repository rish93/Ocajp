package com.ocajp.label.flowcontrol;

public class LabelBreakContinue {

	public static void main (String [] args) {
	//399
		
	outer : {
		int[] myArray = {1,2,3};
	}//label should be with curly braces for variable
	//but {for,while loop,try,switch,expression,assignment,return ,try ,throws it can be direct}
		
	
	String[] loop = {"Outer", "Inner"};
	outer:
	for (String outer : loop) {
		for (String inner : loop) {
			if (inner.equals("Inner"))
			break outer;
			System.out.print(inner + ":");
			//Outer:
		}
	}
	
	
	String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
	outer:
	for (String name1 : programmers) {
		for (String name : programmers) {
			if (name.equals("Shreya"))
				continue outer;
				System.out.println(name);
				/*
				 * Paul
				   Paul
				   Paul   will continue with next iteration of outer loop */
			}
		}
	
	}
}
