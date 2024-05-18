package scaler.dsa.day15.classwork.Array1D;

public class MaxSubArraySumOfAllSubArrays {

	public static void main(String[] args) {
		// int A[]=new int[] {-2,3,4,-1,5,-10,7}; //ans 11

		int A[] = new int[] { -3, 4, 6, 8, -10, 2, 7 }; // ans 18
//		int A[]=new int[] {4,5,2,1,6};  //ans 18
//		int A[]=new int[] {-4,-3,-6,-9,-2}  //ans -2
		int size = A.length;
		int sum1 = max_sum_subarray(A, size);
		System.out.println("sum1::"+sum1);
		
		int sum2 = max_sum_subarray_Optimized(A, size);
		System.out.println("sum2::"+sum2);
	}

// TC O(n^2) SC O(1)
	private static int max_sum_subarray(int[] A, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + A[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

	// TC O(n) SC O(1)
	private static int max_sum_subarray_Optimized(int[] A, int n) {
		int max = Integer.MIN_VALUE;
		int current = 0;
		for (int i = 0; i < n; i++) {
			current = current + A[i];
			if (current > max) {
				max = current;
			}
			if(current<0) {
				current=0;
			}
		}
		return max;
	}

}
