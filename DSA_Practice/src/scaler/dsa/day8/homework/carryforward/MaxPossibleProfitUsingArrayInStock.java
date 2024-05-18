package scaler.dsa.day8.homework.carryforward;

public class MaxPossibleProfitUsingArrayInStock {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 5, 2, 4 };
		// int [] arr=new int[] {2,1};
		int maxProfit = maxProfit(arr);
		System.out.println(maxProfit);

	}
//
//	public static int maxProfit(final int[] A) {
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		int arrLength = A.length;
//		int maxProfit = 0;
//		if (arrLength == 0) {
//			return 0;
//		}
//
//		for (int i = 0; i < arrLength; i++) {
//			if (A[i] > max) {
//				max = A[i];
//			}
//			if (A[i] < min) {
//				min = A[i];
//			}
//		}
//
//		int lastMinIndex = -1;
//		int lastMaxIndex = -1;
//		for (int i = 0; i < arrLength; i++) {
//			if (A[i] == min) {
//				lastMinIndex = i;
//			}
//			if (A[i] == max) {
//				lastMaxIndex = i;
//			}
//			if (lastMaxIndex != -1 && lastMinIndex != -1 && lastMaxIndex > lastMinIndex) {
//				maxProfit = max - min;
//			}
//		}
//
//		return maxProfit;
//
//	}
	
	
// TC O(N^2)
//	public static int maxProfit(final int[] A) {
//		int arrLength = A.length;
//		int maxProfit = 0;
//		int profit = 0;
//		if (arrLength == 0) {
//			return 0;
//		}
//		int max = 0;
//		for (int i = 0; i < arrLength; i++) {
//			max = A[i];
//			for (int j = i + 1; j < arrLength; j++) {
//				if (A[j] > max) {
//					max = A[j];
//				}
//			}
//			profit = max - A[i];
//			if (profit> maxProfit  ) {
//				maxProfit=profit;
//			}
//
//		}
//
//		return maxProfit;
//
//	}
	
	// carry forward technique used TC O(n)
	public static int maxProfit(final int[] A) {
		int arrLength = A.length;
		int maxProfit = 0;
		int profit = 0;
		if (arrLength == 0) {
			return 0;
		}
		int max = A[arrLength-1];
		for (int i = arrLength-2; i>=0; i--) {
			if (A[i] > max) {
				max = A[i];
			}
			profit = max - A[i];
			if (profit> maxProfit  ) {
				maxProfit=profit;
			}
		}
		return maxProfit;
	}
}
