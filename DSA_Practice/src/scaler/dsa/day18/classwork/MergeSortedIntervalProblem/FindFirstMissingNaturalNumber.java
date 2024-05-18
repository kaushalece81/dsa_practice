package scaler.dsa.day18.classwork.MergeSortedIntervalProblem;

public class FindFirstMissingNaturalNumber {
//	Q1. First Missing Integer
//	Problem Description
//
//	Given an unsorted integer array, A of size N. Find the first missing positive integer.
//
//	Note: Your algorithm should run in O(n) time and use constant space.
//
//	Problem Constraints
//
//	1 <= N <= 1000000
//
//	-109 <= A[i] <= 109
//
//	Input Format
//
//	First argument is an integer array A.
//
//	Output Format
//
//	Return an integer denoting the first missing positive integer.
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 0 };
		int firstMissingPositive = firstMissingPositive(a);
		System.out.println(firstMissingPositive);
	}

	public static int firstMissingPositive(int[] A) {
		int n = A.length;
		// for negative numbers just add some positive number greater than n+2
		for (int i = 0; i < n; i++) {
			if (A[i] <= 0) {
				A[i] = n + 2; // 
			}
		}

		for (int i = 0; i < n; i++) {
			int x = Math.abs(A[i]);
			if (x >= 1 && x <= n) {
				A[x - 1] = (-1) * (Math.abs(A[x - 1]));
			}
		}
		for (int i = 1; i < n+1; i++) {
			if (A[i-1] > 0) {
				return i;
			}
		}
		return n + 1;
	}
}
//
//Example Input
//
//Input 1:
//
//[1, 2, 0]
//
//Input 2:
//
//[3, 4, -1, 1]
//
//Input 3:
//
//[-8, -7, -6]
//
//

//Example Output
//
//Output 1:
//
//3
//
//Output 2:
//
//2
//
//Output 3:
//
//1
//
//Example Explanation
//
//Explanation 1:
//
//A = [1, 2, 0]
//First positive integer missing from the array is 3.
//
//Explanation 2:
//
//A = [3, 4, -1, 1]
//First positive integer missing from the array is 2.
//
//Explanation 3:
//
//A = [-8, -7, -6]
//First positive integer missing from the array is 1.
