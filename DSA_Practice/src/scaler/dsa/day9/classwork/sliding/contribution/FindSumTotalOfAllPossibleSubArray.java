package scaler.dsa.day9.classwork.sliding.contribution;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindSumTotalOfAllPossibleSubArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };

		int startIndex = 0;
		int endIndex = arr.length;
		Set<String> set = printSubArrayByStarEndIndex(arr, startIndex, endIndex);
		System.out.println(set);

		int totalBruitForce = sumTotalBruitForceOfAllPossibleSubarray(arr);
		System.out.println("totalBruitForce=" + totalBruitForce);
		int totalCarryForward = optimizedCarryForwardSumTotalOfAllPossibleSubarray(arr);
		System.out.println("totalCarryForward=" + totalCarryForward);

		int totalPrefixSum = optimizedUsingPrefixSum_SumTotalOfAllPossibleSubarray(arr);
		System.out.println("totalPrefixSum=" + totalPrefixSum);

		int totalContributionTechnique = optimizedContributionTechniqueSumTotalOfAllPossibleSubarray(arr);
		System.out.println("totalContributionTechnique=" + totalContributionTechnique);
	}

	// bruit force O(n^2)
	private static int sumTotalBruitForceOfAllPossibleSubarray(int[] arr) {

		int len = arr.length;
		int total = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
				}
				total = total + sum;
			}
		}
		return total;
	}

	// carry forward technique taken to reduce complexity from O(n^3) to O(n^2)
	// number of possible subarray is n(n+1)/2 used carry forward technique   SC O(1)
	private static int optimizedCarryForwardSumTotalOfAllPossibleSubarray(int[] arr) {
		int len = arr.length;
		int total = 0;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum = sum + arr[j];
				total = total + sum;
			}
		}
		return total;

	}
// TC O(n^2) SC O(n)
	private static int optimizedUsingPrefixSum_SumTotalOfAllPossibleSubarray(int[] arr) {
		int n = arr.length;
		int[] prefixSum = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}

		int total = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				int l=i;
				int r=j;
				sum=(l==0)?prefixSum[r]:(prefixSum[r]-prefixSum[l-1]);
				System.out.println(" prefix sum  l=" + l + " ,r=" + r + " , sum=" + sum);
				total = total + sum;
			}
		}
		return total;

	}

	// further more optimized O(n) contribution technique
	private static int optimizedContributionTechniqueSumTotalOfAllPossibleSubarray(int[] arr) {
		int n = arr.length;
		int total = 0;
		for (int i = 0; i < n; i++) {
			total = total + arr[i] * (i + 1) * (n - i); /// cnt=(i+1)*(n-i)
		}
		return total;

	}

	private static Set<String> printSubArrayByStarEndIndex(int[] arr, int startIndex, int endIndex) {
		Set<String> set = new LinkedHashSet<>();
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i; j < endIndex; j++) {
				StringBuilder sb = new StringBuilder();
				for (int k = i; k <= j; k++) {
					sb.append(arr[k] + " ");
				}
				set.add(sb.toString());
			}
		}
		return set;
	}

}
