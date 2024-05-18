package scaler.dsa.day9.homework.sliding.contribution;

public class NumberOfSubArrayLessthanSum {
	/*
	 * Given an array A of N non-negative numbers and a non-negative number B, you
	 * need to find the number of subarrays in A with a sum less than B.
	 */
	public static void main(String[] args) {
		int arr[]=new int[] {2,5, 6};
		int B = 10;
		int solve = solve(arr,B);
		System.out.println(solve);

	}
	 public static  int solve(int[] A, int B) {
		 int len = A.length;
		 int count=0;
			for (int i = 0; i < len; i++) {
				int sum = 0;
				for (int j = i; j < len; j++) {
					sum = sum + A[j];
					System.out.println(" i=" + i + " ,j=" + j + " , sum=" + sum);
					 if(sum<B){
	                     count++;
	                 }
				}
			}
			return count;
	    }
	


}
