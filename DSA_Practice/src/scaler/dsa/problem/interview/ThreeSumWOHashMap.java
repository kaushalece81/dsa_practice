package scaler.dsa.problem.interview;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 * 
 */
public class ThreeSumWOHashMap {
	// Time complexity n^3
	public static void main(String[] args) {
		int arr[] = { 7, -6, 3, 8, -1, 8, -11 };
		int target = 0;
		//sample o/p [3 8 -11, 7 -6 -1]
		Set<String> set = threeSum(arr, target);
		System.out.println(set);

	}

	private static Set<String> threeSum(int[] arr, int target) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) { // [0,N-1] N
			for (int j = i + 1; j < arr.length; j++) { // [1,N-2] N-2--> (N-2)(N-2+1)/2=(N-2)(N-1)/2=O(N^2)
				for (int k = j + 1; k < arr.length; k++) {
					if (target == (arr[i] + arr[j] + arr[k]) && !set.contains(arr[i] + " " + arr[j] + " " + arr[k])) {
//						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						set.add(arr[i] + " " + arr[j] + " " + arr[k]);
					}

				}
			}
		}
		return set;

	}

}
