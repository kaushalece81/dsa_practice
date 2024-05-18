package scaler.day6.homework.arrays.rotate.ktimes;

public class SecondLargestAfterSort {

	public static void main(String[] args) {
		 int arr[] = new int[] { 13, 7, 16, 18, 14, 17, 18, 8, 10 };
		// int arr[] = new int[] { 4 };
		//int arr[] = new int[] { 4, 4, 4 };
		int solve = solve(arr);
		System.out.println(solve);
	}

	public static int solve(int[] A) {
		int length = A.length;
		int secondLargest = 0;
		if (length <= 1) {
			return -1;
		}
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		int count = 1;
		for (int j = length-1; j >0; j--) {
			if (A[j] != A[j - 1]) {
				secondLargest = A[j - 1];
				break;
			}
			if (A[j] == A[j - 1]) {
				count++;
			}
		}
		if (length == count) {
			return -1;
		}
		return secondLargest;
	}

}
