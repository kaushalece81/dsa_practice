package scaler.dsa.problem.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * 
 * 
 */
public class ThreeSumUsingHashMapTwoPointerApproach {
// Time complexity n^2   space complexity O(n)
	public static void main(String[] args) {
		// compulsaorily it should be sorted array in 2 pointer approach
//		int arr[] = { -1, -1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 6 };
//		int target = 6;
		int arr[] = { 7, -6, 3, 8, -1, 8, -11 };
		int target = 0;

		Set<String> set = threeSum(arr, target);
		System.out.println(set);

	}

	private static Set<String> threeSum(int[] arr, int target) {
		//  target= arr[i] + arr[j] + arr[k]
		// arr[j] + arr[k]=target- arr[i]
		// j=i+1   k=arr.length-1
		//first sort array
		Arrays.sort(arr);  //O(nlogn)
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			// avoid duplicate arr[i] elements to be considered
			if(i==0 || arr[i]!=arr[i-1]) {
				int j=i+1;
				int k=arr.length-1;
				int searchElementSum = target - arr[i];
				while(j<k) {
					if(arr[j]+arr[k]==searchElementSum) {
						set.add(arr[i] + " " + arr[j] + " " + arr[k]);
						// ignore duplicates arr[j]
						while(j<k && arr[j]==arr[j+1]) {
							j++;
						}
						// ignore duplicates arr[k]
						while(j<k && arr[k]==arr[k-1]) {
							k--;
						}
						j++;
						k--;
					}else if(arr[j]+arr[k]<searchElementSum) {
						j++;
					}else {
						k--;
					}
				}
			}
		}

		return set;

	}

}
