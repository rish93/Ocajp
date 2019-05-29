package com.ocajp.inheritence;


/*an interface defines what behavior would be supported by the classes that
implement it.*/

/*All methods of an interface are implicitly public. The interface variables are
implicitly public, static, and final*/

//properties and behaviour in interface
//name, address, phoneNumber,experience

//properties behaviour in Engineer
//programming langugages, writeCode()


//in manager
//reportProjectStatus(), team size.


//imagine if employee is asked to implement additionl behaviour 
/*Attend training Programmer
 * Attend training, conduct interviews  Manager*/

//approach1 add to employee interface but conduct interview is not needed by programmer
//approach 2 is to add relevant method in particular classes but not an ideal soln

//if we are asked to add training schedule for employees who attended training
// we cant define multiple classes with different behaviour and extend not allowed


//we can have common properties and behaviour in one class 
//and specified in particular interface

//not abstract class because employee class has existence but abstaraction will not make 
//it mor real time

public /*abstract strictfp only allowed*/  interface InterfaceImplementation { //top level can be default and public not privbate protected
//not allowed on top level interface non access modifier (final, static, transient, synchronized, or volatile)
	//training
	//training schedule
}

 interface  InterfaceImplementation1{

	//interview
	 
	
}

class Employee1{
	String name;
	String adddres;
	String phoneNumber;
	float experience;
	
	public static interface d{}//public private default within interface can be inside class is valid
	private strictfp interface kj{ //can use strictfp,static,abstract as non access modifier for interface but not final,synchronized, transient, or volatile
		
		//within interface members are public static and final
		//protected int i;not valid
		//private String j;not valid
		public static Integer k=0;
		
		public String getString();
//		protected int getValue();  not allowed
//		private void display();//not allowed
		public void print();//if providing body use static or default
		
	}
	protected abstract interface f{
		int j=10;
		
		 interface j{}		//inner interface allowed but should be default
							//	(indirectly prefixed with public) or publlic
			 public interface k{
				
				 int k= j;//allowed can redefine variable with different value as public static final
			 };//allowed
			 //not allowed	private interface g{};
			 //protected interface h{}
	}
	
}

class Manager1 extends Employee1 implements InterfaceImplementation{
	
	int teamSize;
	void reportProjectStatus() {}
	public void conductInterview() {
	System.out.println("Mgr - conductInterview");
	}
	public void attendTraining() {
	System.out.println("Mgr - attendTraining");
	}
	
}


class Engineer1 implements InterfaceImplementation,InterfaceImplementation1 {
	
	String[] programmingLanguages;
	void writeCode() {}
	public void attendTraining() {
	System.out.println("Prog - attendTraining");
	}
	
	
	/*You can declare a top-level interface with only the following nonaccess modifiers:
	abstract
	¦
	strictfp
	¦*/
	
}