package com.ocajp.programs;

public class SwapNthValueFromBeginningAndLastLinkList {

	
	
	/*
	 *  Exchange kth node from start and kth node from end of a singly linked list.
	 *	Example: if the linked list is
	 *	5->10->25->45->31->16->23->51 and k=3
	 *	Then linked should be converted to
	 * 	5->10->16->45->31->25->23->51
	 * Morgan
     */
	public SwapNthValueFromBeginningAndLastLinkList() {
		// TODO Auto-generated constructor stub
	}
	Node head; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNthValueFromBeginningAndLastLinkList swapL=new SwapNthValueFromBeginningAndLastLinkList();
		swapL.push();
		swapL.print();
		
		//  Node node= new Node(3); can't make instance of inner class from
		//  static method like this need either object of 
		//  current class or static class of other inner class
		/*. Must qualify the allocation with an enclosing instance 
		 *  of type SwapNthValueFromBeginningAndLastLinkList (e.g. x.new A() where x is
		 *  an instance of SwapNthValueFromBeginningAndLastLinkList).*/
		swapL.swapValue(2);
		swapL.print();
		
	}

	void swapValue(int n) {
		Node current=head;
		Node nthnode=head; 
		Node ahead=head;
		int tempData;
		 int i=0;
			 while( i<n) {
				 ahead=ahead.next;
				 i++;
			 }
			 nthnode=ahead;
			 while(ahead!=null) {
				 ahead=ahead.next;
				 current=current.next;
			 }
			 tempData=current.data;
			 current.data=nthnode.data;
			 nthnode.data=tempData; 
		}
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	void push() {
		for(int i=10;i>0;i--) {

				Node node= new Node(i);
				node.next= head;
				head=node;
			}
	}
	
	 class Node{
		int data;
		Node next;
		Node(int n){
			next=null;
			data=n;
		}
	}
}
