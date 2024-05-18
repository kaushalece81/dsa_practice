package scaler.dsa.day20.homework.BitManipulation2;
public class ElementOccureTwiceExceptOneSingleNumber {
   //Q1. Single Number
//	Problem Description
//
//	Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
//
//	NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//	Problem Constraints
//
//	    1 <= |A| <= 2000000
//
//	    0 <= A[i] <= INTMAX
//
//	Input Format
//
//	The first and only argument of input contains an integer array A.
//
//	Output Format
//
//	Return a single integer denoting the single element.
	public static void main(String[] args) {
		//int [] A=new int[] {4,5,5,1,6,4,6};//1
		int [] A=new int[] {1, 2, 2, 3, 1};//3
		int singleNumber = singleNumber(A);
		System.out.println(singleNumber);
	}
	public static int singleNumber(final int[] A) {
		int xor=0;
		int size=A.length;
		for(int i=0;i<size;i++) {
			xor=xor^A[i];
		}
		return xor;
    }
//    public static int singleNumber(final List<Integer> A) {
//    	int
//    }
}


//Example Input
//
//Input 1:
//
// A = [1, 2, 2, 3, 1]
//
//Input 2:
//
// A = [1, 2, 2]
//
//
//
//Example Output
//
//Output 1:
//
// 3
//
//Output 2:
//
// 1
//
//
//
//Example Explanation
//
//Explanation 1:
//
//3 occurs once.
//
//Explanation 2:
//
//1 occurs once.


