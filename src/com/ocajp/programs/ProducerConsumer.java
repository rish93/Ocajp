package com.ocajp.programs;

//Java program to implement solution of producer 
//consumer problem. 
import java.util.LinkedList; 

public class ProducerConsumer 
{ 
	public static void main(String[] args) 
						throws InterruptedException 
	{ 
		// Object of a class that has both produce() 
		// and consume() methods 
		final PC pc = new PC(); 

		// Create producer thread 
		Thread t1 = new Thread(new Runnable() 
		{ 
			@Override
			public void run() 
			{ 
				try
				{ 
					pc.produce(); 
				} 
				catch(InterruptedException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
		}); 

		// Create consumer thread 
		Thread t2 = new Thread(new Runnable() 
		{ 
			@Override
			public void run() 
			{ 
				try
				{ 
					pc.consume(); 
				} 
				catch(InterruptedException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
		}); 

		// Start both threads 
		t1.start(); 
		t2.start(); 

		// t1 finishes before t2 
		t1.join(); /*join(): It will put the current thread on wait 
							until the thread on which it is called is dead. If thread is 
							interrupted then it will throw InterruptedException.*/
		t2.join(); 
	} 

	// This class has a list, producer (adds items to list 
	// and consumber (removes items). 
	public static class PC 
	{ 
		// Create a list shared by producer and consumer 
		// Size of list is 2. 
		LinkedList<Integer> list = new LinkedList<>(); 
		/*Note that this implementation is not synchronized. If multiple threads access a linked list
		 *  concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
		 *   (A structural modification is any operation that adds or deletes one or more elements; merely setting the value of an 
		 *   element is not a structural modification.) This is typically accomplished by synchronizing on some object that naturally 
		 *   encapsulates the list. If no such object exists, the list should be "wrapped" using
		 *  the Collections.synchronizedList method. This is best done at creation time, to prevent accidental */
		int capacity = 2; 

		// Function called by producer thread 
		public void produce() throws InterruptedException 
		{ 
			int value = 0; 
			while (true) 
			{ 
				synchronized (this) /*. Inside this loop, we have a synchronized block so 
										that only a producer or a consumer thread runs at a time.*/
				{ 
					// producer thread waits while list 
					// is full 
					 /*An inner loop is there before adding the jobs to list that checks if the job
						list is full, the producer thread gives up the intrinsic lock on PC and goes
						on the waiting state.*/
					while (list.size()==capacity)
						wait(); 
						/*Causes the current thread to wait until another thread invokes the notify() method or
						 *  the notifyAll() method for this object. In other words, this method behaves exactly as if it 
						 *  simply performs the call wait(0). The current thread must own this object's monitor. The thread
						 *   releases ownership of this monitor and waits until another thread notifies threads waiting on this 
						 *   object's monitor to wake up either through a call to the notify method or the notifyAll method. The thread
						 *    then waits until it can re-obtain ownership of the monitor and resumes execution. 
								As in the one argument version, interrupts and spurious wakeups are possible,
								 and this method should always be used in a loop: 
*/

					System.out.println("Producer produced-"
												+ value); 

					// to insert the jobs in the list 
					list.add(value++);              /*If the list is empty, the control passes to below the loop and it adds a value in the list.*/

					// notifies the consumer thread that 
					// now it can start consuming 
					notify(); 
					/*In both the methods, we use notify at the end of all statements. The reason is simple, 
					 * once you have something in list, you can have 
					 * the consumer thread consume it, or if you have consumed something, you can have 
					 * the producer produce something.*/

					// makes the working of program easier 
					// to understand 
					Thread.sleep(1000); 
				} 
			} 
		} 

		// Function called by consumer thread 
		public void consume() throws InterruptedException 
		{ 
			while (true) 
			{ 
				synchronized (this) 
				{ 
					// consumer thread waits while list 
					// is empty 
					while (list.size()==0) 
						wait(); 
											/*Inside, we also have an inner loop which checks if the list is empty.
											If it is empty then we make the consumer thread give up the lock on PC and
											 passes the control to producer thread for producing more jobs.*/
					//to retrive the ifrst job in the list 
					int val = list.removeFirst(); 

					System.out.println("Consumer consumed-"
													+ val); 

					// Wake up producer thread 
					notify(); 
					/*In both the methods, we use notify at the end of all statements. The reason is simple, 
					 * once you have something in list, you can have 
					 * the consumer thread consume it, or if you have consumed something, you can have 
					 * the producer produce something.*/

					// and sleep 
					Thread.sleep(1000); 
				} 
			} 
		} 
	} 
} 
