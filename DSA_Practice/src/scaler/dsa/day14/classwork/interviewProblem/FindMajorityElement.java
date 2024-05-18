package scaler.dsa.day14.classwork.interviewProblem;

public class FindMajorityElement {
//more tha n/2 times
//	Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
//
//	You may assume that the array is non-empty and the majority element always exists in the array.
//	Problem Constraints
//	1 <= N <= 5*105
//	1 <= num[i] <= 109
//
//
//
//	Input Format
//	Only argument is an integer array.
//
//
//
//	Output Format
//	Return an integer.
	public static void main(String[] args) {
		int[] A = new int[] { 2, 1, 2 };
		int majorityElement = majorityElement(A);
		System.out.println(majorityElement);
	}

	public static int majorityElement(final int[] A) {
		int n = A.length;
		int majority = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				majority = A[i];
				count = 1;
			} else {
				if (majority == A[i]) {
					count++;
				} else {
					count--;
				}
			}
		}

		count = 0;
		for (int i = 0; i < n; i++) {
			if (majority == A[i]) {
				count++;
			}
		}
		if (count > n / 2) {
			return majority;
		}
		return -1;
	}

}

//Example Input
//Input 1:
//
//[2, 1, 2]
//
//Input 2:
//
//[1, 1, 1]
//
//
//
//Example Output
//Input 1:
//
//2
//
//Input 2:
//
//1
//
//
//
//Example Explanation
//For Input 1:
//
//2 occurs 2 times which is greater than 3/2.
//
//For Input 2:
//
// 1 is the only element in the array, so it is majority