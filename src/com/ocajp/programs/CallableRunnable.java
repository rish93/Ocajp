package com.ocajp.programs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunnable {

	public CallableRunnable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExecutorService executor= Executors.newFixedThreadPool(3);
		Future<?> runFuture=	executor.submit(new runn());
		/*Submits a Runnable task for execution and returns a Future representing that task.
		 *  The Future's get method will return null upon successful completion.
*/
	
//		
		Future<Integer> callFuture=	executor.submit(new call());
	/*	Submits a value-returning task for execution and returns a Future representing the pending 
	 * results of the task. The Future's get method will return the task's result upon successful completion. 
		If you would like to immediately block waiting for a task, you can use constructions of the 
		form result = exec.submit(aCallable).get(); 
	 */

		
		try {
			if(runFuture.get()==null) {
			System.out.println(runFuture.isDone()+" done");/**/
			}
			
				System.out.println("done"+callFuture.get());
			
			
			
		
			 executor.shutdown();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	
}

class call implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
	Integer sum = 0;
		for(int i=0;i<10000;i++) {
			sum=sum+i;
			//System.out.println(sum);
		}
//		/System.out.println("sum"+sum);
		
		return sum;
	}
	
}


class runn implements Runnable{

	@Override
	public void run() {
		Integer sum = 0;
		for(int i=100000;i>1;i--) {
			sum=i;
			//System.out.println(sum);
		}
		
		// TODO Auto-generated method stub
		
	}
	
}