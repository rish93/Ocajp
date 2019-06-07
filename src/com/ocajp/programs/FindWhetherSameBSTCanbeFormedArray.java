package com.ocajp.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWhetherSameBSTCanbeFormedArray {
	static Set<Integer> s= new HashSet<Integer>();
	public FindWhetherSameBSTCanbeFormedArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {2,1,3};
		int arr1[]=new int[] {2,3,1};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(arr.length!=arr1.length)
			return;
		
		NodeBST root1=	createBst(arr,0,arr.length-1);
		NodeBST root2=	createBst(arr1,0,arr1.length-1);
		
		
		printPreorder(root1);
		System.out.println();
		printPreorder(root2);
		System.out.println();

		System.out.println(s.size()==3?"true":"false");
	}
	
	static NodeBST createBst(int []arr,int l,int size) {
		 if (l > size) { 
	            return null; 
	        } 
		
		int mid=(l+size)/2;
		NodeBST node= new NodeBST (arr[mid]);
		node.left=createBst(arr,l,mid-1);
		node.right=createBst(arr,mid+1,size);
		return node;
				
	}
	
	static void printPreorder(NodeBST node) {
		if(node==null) {
			return;
		}
		   System.out.print(node.value + " ");
		   s.add(node.value);
		// first recur on left subtree 
		printPreorder(node.left); 
  
        // then recur on right subtree 
		printPreorder(node.right); 
  
        // now deal with the node 
	}
	
}

class NodeBST {
	NodeBST left;
	NodeBST right;
	int value;
	NodeBST(int value){
		this.value=value;
		left=null;
		right=null;
		
	}
}
