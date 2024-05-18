package scaler.dsa.day15.homework.Array1D;
public class MaxSumContiguousSubarray {
//	Problem Description
//
//	Find the maximum sum of contiguous non-empty subarray within an array A of length N.
//
//	Problem Constraints
//
//	1 <= N <= 1e6
//	-1000 <= A[i] <= 1000
//
//	Input Format
//
//	The first and the only argument contains an integer array, A.
//
//	Output Format
//
//	Return an integer representing the maximum possible sum of the contiguous subarray. 
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public static void main(String[] args) {
		int A[]=new int[] {1, 2, 3, 4, -10}; 
		int sum=maxSubArray(A);/// o/p 10 
		System.out.println(sum);
	}
    public static int maxSubArray(final int[] A) {
    	int n=A.length;
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

//Example Input
//
//Input 1:
//
// A = [1, 2, 3, 4, -10] 
//
//Input 2:
//
// A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 
//
//
//
//Example Output
//
//Output 1:
//
// 10 
//
//Output 2:
//
// 6 
//
//
//
//Example Explanation
//
//Explanation 1:
//
// The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
//
//Explanation 2:
//
// The subarray [4,-1,2,1] has the maximum possible sum of 6. 
//


