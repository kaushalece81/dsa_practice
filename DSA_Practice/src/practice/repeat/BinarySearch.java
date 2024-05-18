package practice.repeat;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int [] arr=new int[] {1,6,2,4,3,10,9};
		int target=9;
		System.out.println("Array before sorting");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("");
		// binary search need array to be sorted before
		Arrays.sort(arr);
		System.out.println("Array After sorting");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		int index=binarySearch(arr,target);
		System.out.println("\nindex:"+index);

		int start=0;
		int end=arr.length-1;
		index=binarySearchUsingRecursion(arr,target,start,end);
		System.out.println("\nusing recursion index:"+index);
	}

	private static int binarySearch(int[] arr, int target) {

		int start=0;
		int end=arr.length-1;
		while(start<= end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return -1;
	}
	
	private static int binarySearchUsingRecursion(int[] arr, int target, int start, int end) {
		// binary search need array to be sorted before
		if(start<= end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start=mid+1;
				return binarySearchUsingRecursion(arr,target,start,end);
			}else {
				end=mid-1;
				return binarySearchUsingRecursion(arr,target,start,end);
			}
		}
		return -1;
	}

}
