package com.ocajp.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LargestDigitFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> arr1; 
        arr1 = new Vector<>();
        
        arr1.add("23");
        arr1.add("99");

        arr1.add("43");

        arr1.add("22");
        printLargest(arr1);
		
		
		
		int arr[]= new int [] {3,5,1,9,34,36,99};
	
		Integer integerArr[]= Arrays.stream(arr).boxed().toArray(Integer[]::new);
	    List<Integer>lsInteger=  Arrays.asList(integerArr);
		Stack<Integer> singleDigitStack= new Stack<Integer>();
	    Stack<Integer> doubleDigitStack= new Stack<Integer>();
	    Collections.sort(lsInteger);//(integerArr,Collections.reverseOrder());
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
	    	try {
		    	while(!doubleDigitStack.empty()) {
	    		   output.add(singleDigitStack.pop());
	    		   //output.add(singleDigitStack.pop());
		    	}
			      //output.add(singleDigitStack.pop());
    	    }
	    	
    		catch(Exception e) {
    			e.printStackTrace();
    		}
	    }
	    else {
	    	try {
		    	while(!singleDigitStack.isEmpty() || !doubleDigitStack.isEmpty()) {
		    		
		    		if(doubleDigitStack.peek()>singleDigitStack.peek()) {
		    			output.add(doubleDigitStack.pop());
		    			output.add(singleDigitStack.pop());
		    		}
		    		else {
		    			output.add(singleDigitStack.pop());
		    			output.add(doubleDigitStack.pop());
		    		}
		    		
		    	}
	    	}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
	    }
	    System.out.println(output);
	    
	}
	
	
	// The main function that prints the  
    // arrangement with the largest value. 
    // The function accepts a vector of strings     
    static void printLargest(Vector<String> arr){ 
        Collections.sort(arr, new Comparator<String>(){ 
        // A comparison function which is used by  
        // sort() in printLargest() 
        @Override
        public int compare(String X, String Y) { 
        // first append Y at the end of X 
        String XY=X + Y; 
        // then append X at the end of Y 
        String YX=Y + X; 
        // Now see which of the two formed numbers  
        // is greater 
        return XY.compareTo(YX) > 0 ? -1:1; 
    } 
    }); 
          
    Iterator it = arr.iterator(); 
    while(it.hasNext()) 
        System.out.print(it.next()); 
    } 
}
