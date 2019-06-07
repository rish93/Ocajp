package com.ocajp.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import org.apache.commons.lang3.StringUtils;
public class StringReverseWithoutInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg=" Is this even a code";
		char[] msgArray=msg.toCharArray();
		//List<String> list= Arrays.asList(msg);
		
		List<String> Result= new ArrayList<String>();
		try {
			int l=msgArray.length;
		for(int i=msgArray.length-1;i>=0;i--) {
			//Result.add(msgArray[i].toString());
				if(msgArray[i]==' ') {
					int j=i+1;
					Result.add(msg.substring(j,l));
					l=l-(l-j);
				}
			
			}
		
		System.out.println(Result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		//System.out.println(Result);
	}

}
