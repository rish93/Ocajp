package com.ocajp.programs;

import java.sql.SQLException;
import java.util.List;

public class CustomExceptionExample {

	public final volatile String s;//cant make final and volatile both
	public static volatile String s1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionExample CustomExceptionExample= new CustomExceptionExample();
		
		try {
		CustomExceptionExample.method3();
		}catch(Exception e) {
			
		}
		CustomExceptionExample.method4();
		
		CustomExceptionExample.method6();
	}

	
	public void method3() throws Exception { // this is fine, as expected
		//if mentioned checked in throws but throwing unchecked then handle it in trycatch or throws from calling method
		//coz it treated as check exception  method
        throw new RuntimeException();
    }
	
	 public void method4() throws RuntimeException { // this is fine, as expected
		//even throws  is missing or throw is missing for runtime no exception should be handled or
		 //thrown from calling method
		 
		 throw new NullPointerException();
	       
	    }

	    public void method5() throws Exception { // this is fine, as expected

	    	//if we throw unchecked exception no need to  either handle it in trycath
	    	//else throws at method declaration
	    	
	       
	    }
	    
	    public void method6(){
	    	throw new SQLException();
	    	//if we throw checked exception either handle it in trycath
	    	//else throws at method declaration
	    	
	    }
	    
	    public void method7() throws NullPointerException { // this is fine, as expected
			//even throws  is missing or throw is missing for runtime no exception should be handled or
			 //thrown from calling method
			 
			 throw new RuntimeException();
		       
		    }
	    
	    
	
}


