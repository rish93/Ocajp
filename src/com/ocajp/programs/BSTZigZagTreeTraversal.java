package com.ocajp.programs;


//Java implementation of a O(n) time 
//method for Zigzag order traversal 
import java.util.*; 

//Binary Tree node 
class LeafNode 
{ 
int data; 
LeafNode leftChild; 
LeafNode rightChild; 
LeafNode(int data) 
{ 
	this.data = data; 
} 
} 

class BinaryTree { 
	LeafNode rootNode; 

//function to print the 
//zigzag traversal 
void printZigZagTraversal() { 
	
	// if null then return 
	if (rootNode == null) { 
	return; 
	} 

	// declare two stacks 
	Stack<LeafNode> currentLevel = new Stack<>(); 
	Stack<LeafNode> nextLevel = new Stack<>(); 

	// push the root 
	currentLevel.push(rootNode); 
	boolean leftToRight = true; 

	// check if stack is empty 
	while (!currentLevel.isEmpty()) { 

	// pop out of stack 
		LeafNode node = currentLevel.pop(); 
	
	// print the data in it 
	System.out.print(node.data + " "); 

	// store data according to current 
	// order. 
	if (leftToRight) { 
		if (node.leftChild != null) { 
		nextLevel.push(node.leftChild); 
		} 
		
		if (node.rightChild != null) { 
		nextLevel.push(node.rightChild); 
		} 
	} 
	else { 
		if (node.rightChild != null) { 
		nextLevel.push(node.rightChild); 
		} 
		
		if (node.leftChild != null) { 
		nextLevel.push(node.leftChild); 
		} 
	} 

	if (currentLevel.isEmpty()) { 
		leftToRight = !leftToRight; 
		Stack<LeafNode> temp = currentLevel; 
		currentLevel = nextLevel; 
		nextLevel = temp; 
	} 
	} 
} 
} 

public class BSTZigZagTreeTraversal { 

//driver program to test the above function 
public static void main(String[] args) 
{ 
	BinaryTree tree = new BinaryTree(); 
	tree.rootNode = new LeafNode(1); 
	tree.rootNode.leftChild = new LeafNode(2); 
	tree.rootNode.rightChild = new LeafNode(3); 
	tree.rootNode.leftChild.leftChild = new LeafNode(7); 
	tree.rootNode.leftChild.rightChild = new LeafNode(6); 
	tree.rootNode.rightChild.leftChild = new LeafNode(5); 
	tree.rootNode.rightChild.rightChild = new LeafNode(4); 
	
	System.out.println(
	"         1"
	+"  	/  \"\n"
	+   "  2    3 \n"
	+   "  / \\   /\\ \n"
	+"    7   6 5  4");
		
	System.out.println("ZigZag Order traversal of binary tree is"); 
	tree.printZigZagTraversal(); 
} 
} 

//This Code is contributed by Harikrishnan Rajan. 
