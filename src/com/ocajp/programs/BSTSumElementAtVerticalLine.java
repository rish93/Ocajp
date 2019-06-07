package com.ocajp.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class BSTSumElementAtVerticalLine {

	
	public static void main(String []args) {
		int arr[]= {2,5,8,3,7,6,1};
		Arrays.sort(arr);
		Node1 node=	Node1.createBst(arr,0,arr.length-1);
		node.printPreOrder(node);
		System.out.println();
		Node1.verticalSum(node);
	}
}

class Node1{
	private int value;
	private Node1 left;
	private Node1 right;
	
	Node1(int value){
		this.value=value;
		left=null;
		right=null;
	}
	static Node1 createBst(int []arr,int l,int size) {
		 if (l > size) { 
	            return null; 
	        } 
		
		int mid=(l+size)/2;
		Node1 node= new Node1 (arr[mid]);
		node.left=createBst(arr,l,mid-1);
		node.right=createBst(arr,mid+1,size);
		return node;
				
	}
	
	static void  printPreOrder(Node1 node) {
		if(node==null) {
			return;
		}
		System.out.print(node.value+",");
		printPreOrder(node.left);
		printPreOrder(node.right);
		
		/*
		 5
		/ \
	   2   7
	  /\   /\ 
	 1  3  6 8
		 
		 */
		
	}

	public static void verticalSum(Node1 root, int dist, Map<Integer, Integer> map)
	{
		// base case: empty tree
		if (root == null)
			return;
		// update the map
		if (!map.containsKey(dist)) {
			map.put(dist, 0);
		}
		map.put(dist, map.get(dist) + root.value);
		// recur for left subtree by decreasing horizontal distance by 1
		verticalSum(root.left, dist - 1, map);
		// recur for right subtree by increasing horizontal distance by 1
		verticalSum(root.right, dist + 1, map);
	}

	// Function to print the vertical sum of given binary tree
		public static void verticalSum(Node1 root)
		{
			// create an empty TreeMap where
			// key -> relative horizontal distance of the node from root node and
			// value -> sum of all nodes present at same horizontal distance
			Map<Integer, Integer> map = new TreeMap<>();

			// do pre-order traversal of the tree and fill the map
			verticalSum(root, 0, map);

			// traverse the TreeMap and print vertical sum
			for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
				System.out.print(entry.getValue() + " ");
			}
		}
}
