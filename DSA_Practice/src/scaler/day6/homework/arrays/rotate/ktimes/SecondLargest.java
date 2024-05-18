package scaler.day6.homework.arrays.rotate.ktimes;

public class SecondLargest {

	public static void main(String[] args) {
	//int arr[]=new int[] {13,7,16,18,14,17,18,8,10};
		//int arr[] = new int[] { 4 };
		int arr[] = new int[] { 4,4,4 };
		int solve = solve(arr);
		System.out.println(solve);
	}

	public static int solve(int[] A) {
		int length = A.length;
		int largest = 0;
		int secondLargest = -1;
		if(length<=1) {
			return -1;
		}
		for (int i = 0; i < length; i++) {
			if (A[i] > largest) {
				largest = A[i];
			}
		}

		for (int i = 0; i < length; i++) {
			if (A[i] != largest  && A[i] > secondLargest  ) {
				secondLargest = A[i];
			}
		}
		System.out.println("secondLargest: " + secondLargest);
		System.out.println("largest: " + largest);
		return secondLargest;
	}

}
