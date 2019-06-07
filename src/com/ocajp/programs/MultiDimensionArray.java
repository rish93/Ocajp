package com.ocajp.programs;

import java.util.Arrays;

public class MultiDimensionArray {

	
	public static void main(String []args) {
//		int arr1[][][] = new int[2][2][];
//		System.out.println(Arrays.deepToString(arr1));
		boolean flag=false;
		int row=-1;
		///A row wise sorted 2-d array of 0's and 1's is given. Find  the row with the most number of 1's.
		int arr[][] = new int[4][2];
		
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=0;
		arr[2][0]=0;
		arr[2][1]=1;
		arr[3][0]=1;
		arr[3][1]=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]==1&& arr[i][1]==1) {
				flag=true;
				row=i+1;
			}
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(	arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println(Arrays.deepToString(arr));
		if(flag)
		System.out.println("at row "+row+" max 1 present");
	}
	
	
	
}
