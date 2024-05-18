package com.sort.list.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortIntArrayAscending {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7};
        System.out.println("Before sorting");
        for(int a: arr) {
        	System.out.print(a+" ");
        }
        ascendingOrder(arr);
        System.out.println("\n After sorting ascending order");
        for(int a: arr) {
        	System.out.print(a+" ");
        }
        reverseOrder_descendingOrder(arr);
        System.out.println("\n After reverse the sorted order");
        for(int a: arr) {
        	System.out.print(a+" ");
        }
        

        
        // convert int array to Integer Array
        
        int[] intArray = {1, 2,4,  3, 5};

        reverseOrderUsingIntegerArray(intArray);
    }

	private static void reverseOrderUsingIntegerArray(int[] intArray) {
		// Convert int array to Integer array
        Integer[] integerArray = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            integerArray[i] = intArray[i]; // Autoboxing
        }
        Arrays.sort(intArray);
        System.out.println("\n integer Array ascending order: " + Arrays.toString(intArray));
        Arrays.sort(integerArray,Collections.reverseOrder());
        System.out.println("\n integer Array reverse order: " + Arrays.toString(intArray));
	}

	private static void ascendingOrder(int[] arr) {
		// Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("\n Sorted array in ascending order: " + Arrays.toString(arr));
	}
	
	private static void reverseOrder_descendingOrder(int[] arr) {
		int start=0;
		int end= arr.length-1;
		while(start< end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}