package com.ocajp.programs;

public class RemoveDuplicateFromLinkList {
	Node head;
	//Remove duplicate element from sorted Linked List
	
	/*if the linked list is 11->11->11->21->43->43->60, then linked list 
	should be converted to 11->21->43->60.*/
	public static void main(String []args) {
		
		
		
		RemoveDuplicateFromLinkList L= new RemoveDuplicateFromLinkList();
		L.addElement(9);
		L.addElement(9);
		L.addElement(7);
		L.addElement(4);
		L.addElement(2);
		L.addElement(2);
		
		L.printLinkList();
		
		L.removeDuplicate();
		System.out. println();
		L.printLinkList();
	}
	
	void addElement(int i){
		Node node= new Node(i);
		node.next=head;
		head=node;
	}
	
	void removeDuplicate() {
		 /*Another reference to head*/
        Node curr = head; 
  
        /* Traverse list till the last node */
        while (curr != null) { 
             Node temp = curr; 
            /*Compare current node with the next node and  
            keep on deleting them until it matches the current  
            node data */
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            /*Set current node next to the next different  
            element denoted by temp*/
            curr.next = temp; 
            curr = curr.next; 
        } 
	} 
	void printLinkList()
	{
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp);
	}

	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}


}
