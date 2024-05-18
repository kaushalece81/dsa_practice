package telusa.search.with.time.complexity;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 9, 10, 11, 15 };
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int length = arr.length;
		int left = 0;
		int right = length - 1;
		int index = binarySearch(arr, target, left, right);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int target, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
				return binarySearch(arr, target, left, right);
			} else {
				right = mid - 1;
				return binarySearch(arr, target, left, right);
			}
		}
		return -1;
	}
	
	

}
