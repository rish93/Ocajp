package com.ocajp.programs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Extend the java.lang.Thread class'
/*
class WaysToCreateThread extends Thread {
	String s;
   
	//method where the thread execution will start 
    public void run(){
      while(true)
    	System.out.println(this.getName());
    	//logic to execute in a thread    
    }

    //let’s see how to start the threads
    public static void main(String[] args){
       Thread t1 = new WaysToCreateThread();
       t1.setName("t1");
       Thread t2 = new WaysToCreateThread();
       t2.setName("t2");
       t1.start();  //start the first thread. This calls the run() method.
       t2.start(); //this starts the 2nd thread. This calls the run() method.  
   //without t1join,t2join  t1,t1,t1,t1,t2,t2,t1,t1,t2,t1,t1,t1...
     //with join t1,t1,t1,t1,t1,t1,t1,t1,t1,t2,t2,t2,t2,t2,t1,t1,t1,t1...  
    try {
		t1.join();
		 t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    }
} 
*/

//Implement the java.lang.Runnable interface
/*
public class WaysToCreateThread implements Runnable{
int count=0;
    @Override
    public void run() {
     while(true)System.out.println((count++));
        // implement run  here 
    }

    public static void main(String[] args) {
        final WaysToCreateThread obj = new WaysToCreateThread();

        Thread t1 = new Thread(new WaysToCreateThread());
        t1.setName("t1");
        t1.start();
    }


}
*/

//Implement the java.util.concurrent.Callable interface

class WaysToCreateThread implements Callable {

    private static final int THREAD_POOL_SIZE = 2;

    // method where the thread execution takes place
    public String call() {
       for(int i=0;i<10;i++)
    	   System.out.print(i);
    	   return Thread.currentThread().getName() + " executing ...";
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        // create a pool of 2 threads
        ExecutorService executor = Executors
                .newFixedThreadPool(THREAD_POOL_SIZE);/*Creates a thread pool that reuses a fixed
									                 number of threads operating off a shared unbounded queue. At any point, at most
									                  nThreads threads will be active processing tasks. If additional tasks are submitted
									                   when all threads are active, they will wait in the queue until a thread is available.
									                    If any thread terminates due to a failure during execution prior to shutdown, a new one
									                     will take its place if needed to execute subsequent tasks. The threads in the pool will
									                      exist until it is explicitly shutdown.
*/

        Future future1 = executor.submit(new WaysToCreateThread());
        Future future2 = executor.submit(new WaysToCreateThread());

        System.out.println("main "+Thread.currentThread().getName() + " executing ...");

        //asynchronously get from the worker threads
        System.out.println(future1.get());//get () Waits if necessary for the computation to complete, and then retrieves its result.

        System.out.println(future2.get());

    }
}
  