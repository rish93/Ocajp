package com.ocajp.programs;

public class CreateBST {

	public static void main(String[] args) {

		/*	
		10
	   / \	
	  8	  15
	 /\    /\
	7  9  11 18

		*/		
		
		Node root=new Node(10);
		
		root.left=new Node(8);
		root.right= new Node(15);
		
		root.right.left= new Node(11);
		root.right.right= new Node(18);
		
		root.left.left= new Node(7);
		root.left.right= new Node(9);
		Node n1=root;
		System.out.println("PREORDER");
		Node.printPreorder(root);
		/*             
		 *               10,8,7,9 15,11,18
		 * */
		Node n2=root;
		System.out.println("INORDER");
		Node.printInorder(root);
		System.out.println();
		/*             
		 *               7,8,9,10,11,15,18
		 * */
		Node n3=root;
		System.out.println();
		System.out.println("POSTORDER");
		Node.printPostorder(root);
		/*             
		 *               7,9,8,11,18,15,10
		 * */
		
	}

	
}

class Node{
	 Node left;
	 Node right;
	public int value;
	
	Node(int value){
		this.value=value;
		left=null;
		right=null;
	}
	
	static void printPreorder(Node node) {
		if(node==null) {
			return;
		}
		   System.out.print(node.value + " "); 
		// first recur on left subtree 
		printPreorder(node.left); 
  
        // then recur on right subtree 
		printPreorder(node.right); 
  
        // now deal with the node 
	}
	
		static void	printInorder(Node node){
				
			
			if(node==null) {
				return;
			}
			 
			printInorder(node.left);
			System.out.print(node.value + " "); 
			printInorder(node.right);
				
		}
		
		static void printPostorder(Node node) {
			
			if(node==null) {
				return;
			}
		
			 printPostorder(node.left);
			 printPostorder(node.right);
			 System.out.print(node.value + " "); 
			
		}
}