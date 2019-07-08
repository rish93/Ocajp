package com.ocajp.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LargestDigitFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int [] {3,5,1,9,34,36,99};
	
		Integer integerArr[]= Arrays.stream(arr).boxed().toArray(Integer[]::new);
	    List<Integer>lsInteger=  Arrays.asList(integerArr);
		Stack<Integer> singleDigitStack= new Stack<Integer>();
	    Stack<Integer> doubleDigitStack= new Stack<Integer>();
	    Collections.sort(lsInteger,Collections.reverseOrder());//(integerArr,Collections.reverseOrder());
	    List<Integer> output = new ArrayList<Integer>();
	    
	    for(Integer digit:lsInteger) {
	    	if(digit/10==0) {
	    		singleDigitStack.push(digit);
	    	}
	    	else {
	    		doubleDigitStack.push(digit);
	    	}
		}
	int i=0;
	    if(singleDigitStack.size() > doubleDigitStack.size()) {
	    	while(!singleDigitStack.empty() || !doubleDigitStack.empty()) {
	    		
	    		try {
	    		
	    			if(doubleDigitStack.peek()>singleDigitStack.peek()) {
		    			output.add(doubleDigitStack.pop());
		    			output.add(singleDigitStack.pop());
		    		}
		    		else {
		    			output.add(singleDigitStack.pop());
		    			output.add(doubleDigitStack.pop());
		    		}
	    		}
	    		catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}
	    }
	    else {
	    	while(!singleDigitStack.isEmpty() || !doubleDigitStack.isEmpty()) {
	    		try {
	    		if(doubleDigitStack.peek()>singleDigitStack.peek()) {
	    			output.add(doubleDigitStack.pop());
	    			output.add(singleDigitStack.pop());
	    		}
	    		else {
	    			output.add(singleDigitStack.pop());
	    			output.add(doubleDigitStack.pop());
	    		}
	    		}
	    		catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}
	    }
	    List<Integer> ls= new ArrayList<Integer>();
	    ls.add(3);
	    ls.add(4);
	    
	    System.out.println(output+""+ls);
	    
	}

}
