/**
 * 
 */
package com.ocajp.programs;


public class SynchronizedThread {
 static int count=0;//using static will reflect changes
 //using reference variable will not
	/**
	 * 
	 */
	public SynchronizedThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public static synchronized void	increment(){
		SynchronizedThread s= new SynchronizedThread();

		s.count=s.count+1;
	}
	public static void main(String[] args) {
		SynchronizedThread s= new SynchronizedThread();
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100000;i++)
				increment();
				
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100000;i++)
				increment();
				
			}
		});
try{
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(s.count);
}catch(Exception e) {
	
}	
}
}