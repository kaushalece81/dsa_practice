package telusa.search.with.time.complexity;

import java.util.Scanner;

public class BinarySearchWORecursion {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 9, 10, 11, 15 };
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int index = binarySearch(arr, target);
		System.out.println("index is ::"+index);
	}

	private static int binarySearch(int[] arr, int target) {
		int length = arr.length;
		int steps=0;
		int left = 0;
		int right = length - 1;
		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				System.out.println("Steps taken by Binary Search::"+steps);
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

}
