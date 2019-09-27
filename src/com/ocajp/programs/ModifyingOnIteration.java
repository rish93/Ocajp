package com.ocajp.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ModifyingOnIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<StringBuilder,String> map= new TreeMap<StringBuilder,String>();
	//	error cant use key for ta map which donot implement comparable(string builder do not)
		map.put(new StringBuilder("2"), "atring");
		map.put(new StringBuilder("1"), "integer");
		map.put(new StringBuilder("3"), "double");
		map.put(new StringBuilder("4"), "ble");
		
		//map.replace(3, "six");
	
	Set<StringBuilder> setKey=map.keySet();
	System.out.println(setKey);	
	
	
	
		for(Map.Entry<StringBuilder, String> entry:map.entrySet())
		{
		
		
		  //  map.put(4, "four");
		  /*councurrent modification exception*/	
		System.out.println(entry.getValue());
			
		}		
	
	List<Integer> ls= new ArrayList<Integer>();
	ls.add(3);
	ls.add(4);
	ls.add(6);
	ls.add(12);

	Iterator<Integer> itr= ls.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next());
		itr.remove();
		//itr.remove();
		//ls.add(99);
	}
	System.out.println(ls);
	}

}
