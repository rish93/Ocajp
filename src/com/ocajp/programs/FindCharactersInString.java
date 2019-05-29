package com.ocajp.programs;

import java.util.ArrayList;
import java.util.List;

public class FindCharactersInString {

	 public static void main(String args[]) {
	      String s="aabbbcccaaab";
	      char[] arr=s.toCharArray();
	     
	     System.out.println(s);
	     List<String> ls= new ArrayList<String>();
	      if(s!=null && arr.length>0){
	              int count =1;   
	     
	          for(int i=0;i<arr.length;i++){
	               try{
	               
	                  if(arr[i]==arr[i+1]){
	                      count++;
	                  }
	                  else{
	                      System.out.println(arr[i]+""+count);
	                      count=1;
	                  }
	               }
	               
	               catch(ArrayIndexOutOfBoundsException e){
	                    count++;
	               }
	          }
	          count=count-1;
	          System.out.println(arr[arr.length-1]+""+count);
	          
	      }
	    }

}
