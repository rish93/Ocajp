package com.ocajp.programs;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer sum = 0;
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");

		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			sum +=	entry.getKey();	
		}
		System.out.print(sum);
		System.out.println();
	
		
		/////////////////////////////////////////////////////////////////////////////////////////////// hashmap with mutable class
		
		StringBuilder strbuilder1= new StringBuilder("one");
		StringBuilder strbuilder2=new  StringBuilder("two");
		StringBuilder strbuilder3=new StringBuilder("three");
		StringBuilder strbuilder4=new StringBuilder("four");

		Map<StringBuilder,Integer> map1= new HashMap<StringBuilder,Integer>();

		strbuilder1.append('a');
		map1.put(strbuilder1,1);
		map1.put(strbuilder2, 2);
		map1.put(strbuilder3, 3);
		map1.put(strbuilder4, 4);
		
		
		for(Map.Entry<StringBuilder, Integer> entry: map1.entrySet()){
			System.out.print(entry.getKey());           //onea,two,three,four
			System.out.println(" "+entry.getValue());    //1,2,3,4
			
		}
	  System.out.println(	map1.get("one"));//null
		
	  
   //////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
	}

}
