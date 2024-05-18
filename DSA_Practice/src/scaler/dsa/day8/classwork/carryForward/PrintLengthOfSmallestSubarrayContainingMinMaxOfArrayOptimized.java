package scaler.dsa.day8.classwork.carryForward;

public class PrintLengthOfSmallestSubarrayContainingMinMaxOfArrayOptimized {
//bruit force 
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		int length = arr.length;
		int lastMinIndex = -1;
		int lastMaxIndex = -1;
		int ansLengthSmallestSubArray = length; // maximum value it can be
		for (int i = 0; i < length; i++) {
			if (arr[i] == min) {
				lastMinIndex = i;
				if (lastMaxIndex != -1) {
					int lengthOfNewSubArrayWithMaxMin = i - lastMaxIndex + 1;
					ansLengthSmallestSubArray = findMinimumOfTwoNumbers(ansLengthSmallestSubArray,
							lengthOfNewSubArrayWithMaxMin);
				}
			}
			// not used else if to handle scenario if both max and min is same
			if (arr[i] == max) {
				lastMaxIndex = i;
				if (lastMinIndex != -1) {
					int lengthOfNewSubArrayWithMaxMin = i - lastMinIndex + 1;
					ansLengthSmallestSubArray = findMinimumOfTwoNumbers(ansLengthSmallestSubArray,
							lengthOfNewSubArrayWithMaxMin);
				}
			}
		}
		System.out.println("ansLengthSmallestSubArray="+ansLengthSmallestSubArray);

	}

	private static int findMinimumOfTwoNumbers(int ansLengthSmallestSubArray, int lengthOfNewSubArrayWithMaxMin) {
		if (ansLengthSmallestSubArray < lengthOfNewSubArrayWithMaxMin) {
			return ansLengthSmallestSubArray;
		} else {
			return lengthOfNewSubArrayWithMaxMin;
		}
	}

}
