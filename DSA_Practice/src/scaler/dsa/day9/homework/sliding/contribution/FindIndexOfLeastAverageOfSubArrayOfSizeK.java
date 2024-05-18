package scaler.dsa.day9.homework.sliding.contribution;

import java.util.HashMap;
import java.util.Map;

public class FindIndexOfLeastAverageOfSubArrayOfSizeK {

//	Given an array A of size N, find the subarray of size B with the least average.

	public static void main(String[] args) {
//		int arr[]=new int[] {3, 7, 90, 20, 10, 50, 40};
//		int B = 3;
		int arr[] = new int[] { 3, 16, 11, 13, 19, 17, 11, 4, 9, 9, 6, 7, 3, 6, 12, 3, 4, 15, 5, 19 };
		int B = 1;
		int solve = solve(arr, B);
		System.out.println(solve);

	}

	public static int solve(int[] A, int B) {
		int minSum = Integer.MIN_VALUE;
		int n = A.length;
		Map<Integer, Integer> map = new HashMap<>();
		int k = B;
		int sum = 0;
		for (int i = 0; i <= k - 1; i++) {
			sum = sum + A[i];
		}
		System.out.println("i=" + 0 + " ,j=" + (k - 1) + " , sum=" + sum);
		minSum = sum;
		map.put(minSum, 0);
		for (int i = 1; i <= n - k; i++) {
			int j = i + k - 1;
			sum = sum + A[j] - A[i - 1];
			System.out.println("i=" + i + " ,j=" + j + " , sum=" + sum);
			minSum = Math.min(minSum, sum);
			System.out.println("minSum=" + minSum);
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}

		}
		System.out.println(map);
		return map.get(minSum);

	}
}
