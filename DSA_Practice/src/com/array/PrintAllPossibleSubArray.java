package com.array;

public class PrintAllPossibleSubArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int startIndex=0;
		int endIndex=0;
		for(startIndex=0;startIndex<arr.length;startIndex++) {
			for(endIndex=startIndex;endIndex<arr.length;endIndex++) {
				for(int k=startIndex;k<=endIndex;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			
		}

	}

}

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//2 
//2 3 
//2 3 4 
//3 
//3 4 
//4 
