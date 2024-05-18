package telusa.search.with.time.complexity;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1,20,3,4,6,70,9,10,11,15};
		Scanner sc=new Scanner(System.in);
		int target = sc.nextInt();
		int index=linearSearch(arr, target);
		System.out.println("index is ::"+index);
	}

	private static int linearSearch(int[] arr, int target) {
		int length = arr.length;
		int steps=0;
		for(int i=0;i<length;i++) {
			steps++;
			if(target==arr[i]) {
				System.out.println("Steps taken by Linear Search::"+steps);
				return i;
			}
		}
		return -1;
	}

}
