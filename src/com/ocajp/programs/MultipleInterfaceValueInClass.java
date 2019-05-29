package com.ocajp.programs;

public class MultipleInterfaceValueInClass implements a,b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println(i);
		//can't access i from from multiple interface as it will be ambiguous 
	}

}


interface a{
int i=10;}

interface b{
int i=5;}

