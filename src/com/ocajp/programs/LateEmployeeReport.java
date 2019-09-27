package com.ocajp.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class LateEmployeeReport {

	public static void main(String[] args) {

		try {
			String lateEntryTime="9:00";
			String lateEntryMidTime="11:00";
			int employee=5;
			String entryTime;
			SimpleDateFormat sdf= new SimpleDateFormat("hh:mm");
			
		for(int j=0;j<7;j++) {
			System.out.println("************ Enter login time in format (hh:mm) for day "+(j+1)+" *******************");
			
				for(int i=0;i<5;i++) {
					BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter entry time for employee"+(i+1));
					entryTime=	br.readLine();
				    Date employeeEntryTime=	sdf.parse(entryTime);/*Parses text from the beginning of the given string to produce 
				    										a date. The method may not use the entire text of the given string. */
				    //takes string parse it to date
				    sdf.format(new Date());//Formats a Date into a date/time string.  takes date gives formatted string
					
				    if(employeeEntryTime!=null && !employeeEntryTime.toString().isEmpty() && 
				    						employeeEntryTime.after(sdf.parse(lateEntryTime))) {
						System.out.println("Emp"+i+" is late");
						if(employeeEntryTime.after(sdf.parse(lateEntryMidTime))){
							System.out.println("Emp"+i+" is late and marked half day");
						}
					}
					else {
						System.out.println("emp"+i+" not late");
					}
			    }
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
