package com.array;

public class PrintSubArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int si=0;
		int ei=0;
		for(si=0;si<arr.length;si++) {
			for(ei=si;ei<arr.length;ei++) {
				for(int k=si;k<=ei;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}

	}

}
