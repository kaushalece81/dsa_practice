package scaler.day6.homework.arrays.rotate.ktimes;

import java.util.Arrays;

public class CountOfElements {
	public static void main(String[] args) {
		// int arr[]=new int[] {3,1,2};
		//int arr[]=new int[] {5, 5, 3};
		//int arr[] = new int[] { 3, 5, 3, 2, 9, 3, 10, 10, 10, 3 };
		int arr[]=new int[] {7, 4, 2, 10, 5};
		// sorted 2,3,3,3,3,5,9,10,10,10
		int solve = solve(arr);
		System.out.println(solve);
	}

	public static int solve(int[] A) {
		int length = A.length;
		int max = 0;
		int numberOfElementsNotEqualToMax=0;
		for (int i = 0; i < length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		
		for (int i = 0; i < length; i++) {
			if(max==A[i]) {
				numberOfElementsNotEqualToMax++;
			}
		}
		
//		System.out.println("max:" + max);
//		System.out.println("numberOfElementsNotEqualToMax:" + numberOfElementsNotEqualToMax);
		return length - numberOfElementsNotEqualToMax;
	}
}