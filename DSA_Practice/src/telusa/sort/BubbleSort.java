package telusa.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 30, 4, 6, 19, 2, 11, 9 };
		int length = arr.length;
		System.out.println("Array Before sorting");
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
		bubbleSorting(arr);
		
		System.out.println("\nArray After sorting");
		for(int a: arr) {
			System.out.print(a+" ");
		}

	}
// here in bubble sort in every iteration multiple swaps is happening 
	//and last value in first iteration is sorted
	//and last 2 value in second iteration is sorted  and so on
	// note swap happens in the inner loop
	private static void bubbleSorting(int arr[]) {
		//time complexity O(n2)  quadratic time complexity
		int length=arr.length;
		int steps=0;
		///10, 22, 30, 4, 6, 19, 2, 11, 9
		for(int i=0;i<length;i++) {
//			for(int j=0;j<length-1;j++) {  // steps 72
			for(int j=0;j<length-i-1;j++) { 
				//j< length-i-1 as in first iteration last value is already sorted steps 36
				// after second iteration last 2 value is sorted
				steps++;
				if(arr[j]>arr[j+1]) {
					//swap is done in inner loop and multiple times swapping done which is a problem
					swap(arr, j);
				}
			}
//			System.out.println("\nArray while sorting");
//			for(int a: arr) {
//				System.out.print(a+" ");
//			}
		}
		System.out.println("\n\nSteps Taken for sorting:: "+steps);
	}

	private static void swap(int[] arr, int j) {
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}

}
