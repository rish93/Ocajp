package com.ocajp.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateMileageTemenos {
	final static Integer gMileage=15;//good mileage
	final static Integer bMileage=10;//bad mileage
	final static Integer uMileage=6;//uphill mileage

	
	public static void main(String[] args) {

		/*public static void main (String[] args)
	{
		private int sum; ILLEGAL MODIFIER FOR PARAMETER SUM; ONLY FINAL IS PERMITTED
		private int i; ILLEGAL MODIFIER FOR PARAMETER I; ONLY FINAL IS PERMITTED
		sum = 0;
		i = 0;
 
		while (i >= 10)
		{
			sum = sum + i;
			i++;
		}
	}
	The modifiers private, protected, and public cannot be used on variables inside of a method. This is because you can only have local variables inside of methods.
	Java is simply telling you that the only modifier allowed at that time is the final keyword.
	*/
		
		
		Long inputFuel = null;
		Long gkm=null;
		Long pkm=null;
		Long ukm=null;
		/*  declaring variable as final inside method is fine , but static inside
		 *  method mean you are trying to declare
		 *  local variable as class level memebr which is conflict. 
		 *  Also class level members are given meemory at class loading hence if locallly defined static it will not get initialized and
		 *  throws error (compilation)
		 * */
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Initial fuel");
			inputFuel=new Long(br.readLine());
			System.out.println("Good km mileage");
			gkm=new Long(br.readLine());
			System.out.println("Bad km mileage");
			pkm=new Long(br.readLine());
			System.out.println("Up hill km mileage");
			ukm=new Long(br.readLine());
			
			Long journyMileage=	calculateJourneyMileage(inputFuel,gkm,pkm,ukm);
		System.out.println("journyMileage "+ journyMileage);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	    
	    static Long calculateJourneyMileage(Long inputFuel,Long gkm,Long pkm,Long ukm){
		//fuel left and overall journey mileage
		   
	       Long petrolLeft= inputFuel- 	(gkm/gMileage+pkm/bMileage+ukm/uMileage);
	       	 
	       System.out.println("petrolLeft "+ petrolLeft);
		  return (gkm+pkm+ukm)/(inputFuel-petrolLeft);
		}

}
