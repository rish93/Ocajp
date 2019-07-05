package com.ocajp.programs;

public class FindSubsetsOfAGivenSet {

	/* Write a code to find all subsets of a given set:-
	Exp: {1,2,3} will give {1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}*/
	
	
	public FindSubsetsOfAGivenSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 char set[] = {'a', 'b', 'c'}; 
	     printSubsets(set); 

	}
	 // Print all subsets of given set[] 
    static void printSubsets(char set[]) 
    { 
        int n = set.length; 
       //--------------------------------------------------------- 
        int x = -4  ; 
        System.out.println( "1"+Integer.toString(x, 2));    
        System.out.println( "2"+Integer.toString(x>>1, 2));    
        int y = 4; 
        System.out.println( "3"+Integer.toString(y, 2));    
        System.out.println( "4"+Integer.toString(y>>1, 2));   
        //--------------------------------------------------------- 
        
        // Run a loop for printing all 2^n 
        // subsets one by one 
        for (int i = 0; i < (1<<n); i++) 
        { System.out.println(n +" "+(1<<n));
             System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
                if ((i & (1 << j)) > 0) 
                    System.out.print(set[j] + " "); 
  
            System.out.println("}"); 
        } 
    } 
}
