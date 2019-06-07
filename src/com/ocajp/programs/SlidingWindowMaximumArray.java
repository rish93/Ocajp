

package com.ocajp.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximumArray {

	
	
	//Sliding Window Maximum (Maximum of all subarrays of size k)
	public static void main(String []args) {
	/*
	 * Input: arr[] = {9, 7, 2, 4, 6, 8, 2, 1, 5}, k = 3
		Output: 9 7 6 8 8 8 5
		Window 1: {9, 7, 2}, max = 9
		Window 2: {7, 2, 4}, max = 7
		Window 3: {2, 4, 6}, max = 6
		Window 4: {4, 6, 8}, max = 8
		Window 5: {6, 8, 2}, max = 8
		Window 6: {8, 2, 1}, max = 8
		Window 7: {2, 1, 5}, max = 5
		*/	
		List<Integer> ls= new ArrayList<Integer>();
		int slideSubArray=3;
		int arr[] = new int[]{9, 7, 2, 4, 6, 8, 2, 1, 5};
		int k=0;
		int max=-1;
		//Integer arr[] = {9, 7, 2, 4, 6, 8, 2, 1, 5};
		//System.out.println("currentarray "+Arrays.asList(arr));
			for(int i=0;i<=arr.length-slideSubArray;i++) {
				max=arr[i];
				for(int j=1;j<slideSubArray;j++) {
				
					if(arr[j+i]>max) {
						max=arr[i+j];
					}
					
					k++;
				}
				System.out.print(max+",");
				max=-1;
			}
		}
}
