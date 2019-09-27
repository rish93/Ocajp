package com.ocajp.programs;

public class LengthOfStringWithoutUsingLengt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="Hi hello Hola";
		
		int i=0;
		char [] arr= s.toCharArray();
		for(char c:arr) {
			i++;
		}
		
		System.out.println(s.length()+" "+i);
		
		
	}

}
