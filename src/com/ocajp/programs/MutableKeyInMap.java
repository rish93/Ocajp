package com.ocajp.programs;

import java.util.HashMap;
import java.util.Map;


public class MutableKeyInMap {

	public MutableKeyInMap() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		
		StringBuffer strBfr= new StringBuffer("Hello");
		Map<StringBuffer,String> map= new HashMap<StringBuffer,String>();
		map.put(strBfr, "World");
		strBfr.reverse();
		System.out.println(map.get(strBfr));
		
		
		
		map.put(strBfr, "strBfr");
		System.out.println(map.get("Hello"));
		System.out.println(map.get(strBfr));
	}
}
