package com.ocajp.label.flowcontrol;

public class Loops {

	
	public static void main(String [] args) {
		
		int i=10;
		do 
			while(i<15)
				i=i+20;
	    while(i<2);
		System.out.println(i);
	   //30
	
		
		int j = 10;
		do
			while (j++ < 15)
			j = j + 20;
		while (j < 2);
		System.out.println(j);
		//32
		
		int k=10;
		
		if(k++ <10){
			System.out.println("true");
		}
		{
			System.out.println("false");
		}
		System.out.println("ABC");
	
		
		int p = 0;
		for (; p < 2; p=p+5) {
		if (p < 5) continue;
		System.out.println(p);
		}
		System.out.println(p);
		//5
		
		int q = 10;
		do
		while (q < 15)
		q = q + 20;
		while (q < 2);
		System.out.println(q);
		//30
		
		
		int o = 10;
		do
			while (o++ < 11)
			o = o + 20;
		while (o < 2);
		System.out.println(o);
		//32
		
		
				int a =
				10;
				if (a++ > 10) {
				System.out.println("true");
				}
				{
				System.out.println("false");
				}
				System.out.println("ABC");
				//in if/while a ++ increment then execurte block
	}
	
}
