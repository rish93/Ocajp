package com.ocajp.label.flowcontrol;

public interface Interface {
	TestInterface t= new TestInterface();
	
	//interface can have default and static implementation of methods
	//top level interface can be only support abstract , strictfp non access modifier
	//remaining interface can have abstract , static, strictfp non access modifier
	//it cant have synchronized, final, volatile,transient
	
	abstract void conductInterview();
	default void submitInterviewStatus() {
	   System.out.println("Accept");
	}
	
	//default int anotherDefaultMethod(); wont compile requires body
	/*default void submitInterviewStatus() {}
	!= abstract method
	*/
	
	//can have body to static method, which act as util method
	static void end(){
		 t.allowed=false;
	}
}


class TestInterface implements Interface
{
	boolean allowed=true;
	@Override
	public void conductInterview() {
		// TODO Auto-generated method stub
		
	}
	
	//we can override default methods and forced to implement unimplemented methods 
	@Override
	public void submitInterviewStatus(){
		
	}
	
	/*1) Default methods can be overriden in implementing class, 
	 * while static cannot.

2) Static method belongs only to Interface class, so 
you can only invoke static
 method on Interface class, not on class implementing this Interface*/
//	@Override
//	void end()
//	{
//		
//	}
	
	
}




class Main{
	public static void main(String []args) {
		
		/*The method
		must be called by prefixing its call with the
		bookConferenceRoom()
		interface name. You can’t call it using a reference variable of the type
		Interviewer
		or of the class that implements this interface.*/
		
		/*
		Interface inv = new Interface();
		inv.end();
		
		//wont compile
		
		TestInterface tetsInterface = new TestInterface();
		tetsInterface.end();
	*/
		//call static method using interface name
		Interface.end();
	
	
	
	
	
	}
	
	
	
}

	/*
	 * attempting to assign
	weaker access privilege
	led to compile erro*/
	interface Interviewer {
		abstract int interviewConducted();
	}
	class Manager2 implements Interviewer {
		public /*need to be public not private protected ot default*/ int interviewConducted() {
		return 1;
	}
		
		
		
		
		
		/*When you implement an interface method in a class, it follows method-overriding
rules:*/
		interface Interviewer {
			abstract Object interviewResult();
			}
			class Manager implements Interviewer {
				@Override
				public String  /* Object String Double Integer Float all are valid when in interface Objct type methd is there */ interviewResult() {
					return null;
				}
				
			}
			
			
		   interface Interviewer3 {
			abstract int interviewConducted();
			}
			class Manager3 implements Interviewer3 {
				/*The return type is incompatible with Manager2.Interviewer3.interviewConducted()*/
			 		
				public int /* Integer  incompatible*/ interviewConducted() {
			 			return 1;
				}
			}
			
			
			
}