package com.ocajp.programs;

public class BSTFindCousinNode {

	public BSTFindCousinNode() {
		// TODO Auto-generated constructor stub
	}
		
			public static void main(String []args) {
				NodeCousin tree = new NodeCousin(); 
				BSTFindCousinNode bst= new BSTFindCousinNode();
			
				System.out.println(" \t\t\t1\r\n" + 
						"			   /   \\\r\n" + 
						"			  2	    3\r\n" + 
						"			/  \\   /  \\\r\n" + 
						"	\t     4	5 6    7\r\n" + 
						"		         \\ \\\r\n" + 
						"		         15 8\r\n" + 
						"		   ");
				/*
				 1
			   /   \
			  2	    3
			/  \   /  \
		   4	5 6    7
		         \ \
		         15 8
		   
		    
				 */
				
				tree = new NodeCousin(1); 
				tree.left = new NodeCousin(2); 
				tree.right = new NodeCousin(3); 
				tree.left.left = new NodeCousin(4); 
				tree.left.right = new NodeCousin(5); 
				tree.left.right.right = new NodeCousin(15); 
				tree.right.left = new NodeCousin(6); 
				tree.right.right = new NodeCousin(7); 
				tree.right.left.right = new NodeCousin(8); 
		
				NodeCousin Node1, Node2; 
				Node1 = tree.left.left; 
				Node2 = tree.right.right; 
				
				printPreOrder(tree);
				
				
				
				if (bst.isCousin(tree, Node1, Node2)) 
					System.out.println("Yes"); 
				else
					System.out.println("No"); 
			} 
	

	private static void printPreOrder(NodeCousin tree) {
		if(tree==null)return;
	
	System.out.print(tree.data+" ,");
	printPreOrder(tree.left);
	printPreOrder(tree.right);
	
	}

	Node root; 

	// Recursive function to check if two Nodes are 
	// siblings 
	boolean isSibling(NodeCousin node, NodeCousin a, NodeCousin b) 
	{ 
		// Base case 
		if (node == null) 
			return false; 

		return ((node.left == a && node.right == b) || 
				(node.left == b && node.right == a) || 
				isSibling(node.left, a, b) || 
				isSibling(node.right, a, b)); 
	} 

	
	// Recursive function to find level of Node 'ptr' in 
		// a binary tree 
		int level(NodeCousin node, NodeCousin ptr, int lev) 
		{ 
			// base cases 
			if (node == null) 
				return 0; 

			if (node == ptr) 
				return lev; 

			// Return level if Node is present in left subtree 
			int l = level(node.left, ptr, lev + 1); 
			if (l != 0) 
				return l; 

			// Else search in right subtree 
			return level(node.right, ptr, lev + 1); 
		} 

		
		// Returns 1 if a and b are cousins, otherwise 0 
		boolean isCousin(NodeCousin node, NodeCousin a, NodeCousin b) 
		{ 
			// 1. The two Nodes should be on the same level 
			//	 in the binary tree. 
			// 2. The two Nodes should not be siblings (means 
			// that they should not have the same parent 
			// Node). 
		
			int level1=level(node, a, 1);
			int level2=level(node, b, 1);
			
			boolean isSibling=isSibling(node, a, b);
			return (level1==level2 && !isSibling);
//			return ((level(node, a, 1) == level(node, b, 1)) && 
//					(!isSibling(node, a, b))); 
		} 
	
}

class NodeCousin 
{ 
	NodeCousin() { 
	} 
	int data; 
	NodeCousin left;
	NodeCousin right; 

	NodeCousin(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
}

