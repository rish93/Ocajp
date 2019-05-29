package com.ocajp.label.flowcontrol;

public class SwitchCase {

	
	
		public static void main(String args[]) {
			int arr[]= {1,2,3};
			int num = 10;
			final int num2 = 20;
				switch (num) {
			/*	for(int i:arr) {
					
				}*///not valid
				case num2:System.out.println(3);
				case 10*3:System.out.println(3);
				case 10/3:
					//for each loop inside case is valid but not in switch
						for(int i:arr) {
							
						}
						System.out.println(3);
				break;
				
				//case num:System.out.println(2); compile error caz case has to be final and constant
				default: System.out.println("default");
			}
				//in cases should be final and constants
				
		
				int number = 20;
				final int number2;
				number2 = 20;
				switch (number) {
				default: System.out.println("default");
				/*case number2: System.out.println(4);
				 * declared final but initialized later hence not constant
				 * case number: System.out.println(4);// compile error
				 *case expressions must be constant expressions*/
				break;
				}
				
				
				
				int numb = 120;
				switch (numb) {
				default: System.out.println("default");
			   /*case 0: System.out.println("case1");
				 case 10*2-20: System.out.println("case2");
				duplicate case 0*/
				break;
				}
				
				
				byte foo = 120;
				switch (foo) {
				default: System.out.println("ejavaguru"); break;
				case 2: System.out.println("e"); break;
				case 120: System.out.println("ejava");
				case 121: System.out.println("enum");
				case 127: System.out.println("guru"); break;
				}
				/*ejava
				  enum
				  guru*/
				
		}
}
