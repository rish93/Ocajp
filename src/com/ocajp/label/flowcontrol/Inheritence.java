package com.ocajp.label.flowcontrol;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Inheritence {

	private static Date getCurrentDate() {
	 
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		return  new java.sql.Date(Calendar.getInstance().getTime().getTime());
	}
	public static void main(String [] args) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	
		
		System.out.println(dateFormat.format(Inheritence.getCurrentDate()));
		
		java.util.Date today = new java.util.Date();
	    System.out.println(new java.sql.Timestamp(today.getTime()));
		
		
	}
		protected String name;
		protected String address;
		protected String phoneNumber;
		protected float experience;
		}
		class Manager extends Inheritence {
			protected int teamSize;
			public void reportProjectStatus() {}
		}
		class Programmer extends Inheritence {
			private String[] programmingLanguages;
			public void writeCode() {}
			public void accessBaseClassMembers() {
			name = "Programmer";
			System.out.println("name: "+name);
		}
}
