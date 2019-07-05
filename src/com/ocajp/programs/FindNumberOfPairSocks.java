package com.ocajp.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumberOfPairSocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 20 20 10 10 30 50 10 20
		Integer []arr= new Integer[] {10,20,20,10,10,30,50,10,20};
		List<Integer>intLst=	Arrays.asList(arr);
		//Collections.sort(intLst);
		if(arr.length>0) {
			try {
				Map<Integer,Integer> map= new HashMap<Integer,Integer>();
				int sumCount = 0;
				for(int i=0;i<arr.length;i++) {
					int count=	Collections.frequency(intLst, intLst.get(i));
						if(count%2==0 && (map.get(intLst.get(i))==null)) {
							sumCount+=count/2;
							map.put(intLst.get(i), sumCount);
						}else if(count%2!=0  && (map.get(intLst.get(i))==null))
						{   
							count=count-1;
							sumCount+=count/2;
							map.put(intLst.get(i), sumCount);
						}
				
				
				}
				System.out.println(map);
				System.out.println(sumCount);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
