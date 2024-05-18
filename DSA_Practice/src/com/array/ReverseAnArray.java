package com.array;

import java.util.Scanner;

public class ReverseAnArray {
	// 10
	// 5 -3 7 6 2 1 8 3 0 4
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int length = sc.nextInt();
//		int [] arr =new int[length];
//		for(int i=0;i<arr.length;i++) {
//		arr[i]=sc.nextInt();
		//Read input
//		System.out.print(arr[i]+" ");
//	}
//		int [] arr =new int[] {5 ,-3, 7, 6 ,2 ,1 ,8, 3, 0, 4};
		int [] arr =new int[] {2,1};



		System.out.println("Original array\n");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		reverseArray(arr);
		
		System.out.println("\nReversed array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		
	}

	private static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			// Swap elements at start and end indices
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			// Move indices towards the center
			start++;
			end--;
		}
	}


}
