package scaler.dsa.day9.classwork.sliding.contribution;

public class PrintMaxSubArraySumOfLengthK {

	public static void main(String[] args) {
//		int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
		//int k = 5;
		int arr[]=new int[] {4, 3, 2, 6, 1};
		int k = 3;
		int len = arr.length;
		solveUsingBruitForce(arr, len, k);
		solveUsingPrefixSumOptimized(arr, len, k);
		solveUsingSlidingWindowTechniqueNoPrefixSum(arr, len, k);
	}

	// TC O(n) SC O(n)
	private static void solveUsingSlidingWindowTechniqueNoPrefixSum(int[] arr, int n, int k) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		// calculating sum for 0 index to k-1
		for (int i = 0; i <=k - 1; i++) {
			sum = sum + arr[i];
		}
		maxSum = sum;
		//// calculating sum for 1 index to n-k both inclusive
		for (int i = 1; i <= n - k; i++) {
			int j = i + k - 1;
			sum = sum + arr[j] - arr[i - 1];
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println("Optimized SlidingWindowTechnique maxSum=" + maxSum);

	}

	// TC O(n) SC O(n)
	private static void solveUsingPrefixSumOptimized(int[] arr, int n, int k) {
		int[] prefixSum = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n - k; i++) {
			int j = i + k - 1;
			int sum = (i == 0) ? prefixSum[j] : (prefixSum[j] - prefixSum[i - 1]);
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println("Optimized PrefixSum maxSum=" + maxSum);

	}

// TC O(n^2)   SC O(1)
	private static void solveUsingBruitForce(int[] arr, int n, int k) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n - k; i++) {
			int j = i + k - 1;
			int sum = 0;
			for (int l = i; l <= j; l++) {
				sum = sum + arr[l];
			}
			System.out.println("i=" + i + " ,j=" + j + " , sum=" + sum);
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println("Bruit force maxSum=" + maxSum);
	}

}
