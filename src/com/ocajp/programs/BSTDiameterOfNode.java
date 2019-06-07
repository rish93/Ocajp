package com.ocajp.programs;

public class BSTDiameterOfNode {

	public static void main(String[] args) {
		 /*
		  4
		/   \ 
	   3     7
	  / \   / \ 
	 1	 5 6   9
		 */
		
		NodeDiameter root= new NodeDiameter(4);
		
		root.left= new NodeDiameter(3);
		root.left.left=new NodeDiameter(1);
		root.left.right=new NodeDiameter(5);
		
		
		root.right= new NodeDiameter(7);
		root.right.left=new NodeDiameter(6);
		root.right.right=new NodeDiameter(9);
		
		printPreorder(root);
		getDiameterLeafNode();
		
	}

	 int diameter(Node root) 
	    { 
	        /* base case if tree is empty */
	        if (root == null) 
	            return 0; 
	  
	        /* get the height of left and right sub trees */
	        int lheight = height(root.left); 
	        int rheight = height(root.right); 
	  
	        /* get the diameter of left and right subtrees */
	        int ldiameter = diameter(root.left); 
	        int rdiameter = diameter(root.right); 
	  
	        /* Return max of following three 
	          1) Diameter of left subtree 
	         2) Diameter of right subtree 
	         3) Height of left subtree + height of right subtree + 1 */
	        return Math.max(lheight + rheight + 1, 
	                        Math.max(ldiameter, rdiameter)); 
	  
	    } 
    /*The function Compute the "height" of a tree. Height is the 
      number f nodes along the longest path from the root node 
      down to the farthest leaf node.*/
    static int height(NodeDiameter node) 
    { 
        /* base case tree is empty */
        if (node == null) 
            return 0; 
  
        /* If tree is not empty then height = 1 + max of left 
           height and right heights */
        return (1 + Math.max(height(node.left), height(node.right))); 
    }
	static void getDiameterLeafNode(NodeDiameter root){
		
		 /* base case if tree is empty */
        if (root == null) 
            return 0; 
  
        /* get the height of left and right sub trees */
        int lheight = height(root.left); 
        int rheight = height(root.right); 
  
        /* get the diameter of left and right subtrees */
        int ldiameter = diameter(root.left); 
        int rdiameter = diameter(root.right); 
  
        /* Return max of following three 
          1) Diameter of left subtree 
         2) Diameter of right subtree 
         3) Height of left subtree + height of right subtree + 1 */
        return Math.max(lheight + rheight + 1, 
                        Math.max(ldiameter, rdiameter)); 
		
		
		
	}
	
	static void printPreorder(NodeDiameter root){
		
		if(root==null) {
			return;
		}
		 System.out.print(root.value+",");
		 printPreorder(root.left);
		 printPreorder(root.right);
		
		
		
	}
}
class NodeDiameter{
	int value;
	NodeDiameter left;
	NodeDiameter right;
	NodeDiameter(){

	}
	NodeDiameter(int value ){
		this.value=value;
	left=null;
	right=null;
		
	}
}