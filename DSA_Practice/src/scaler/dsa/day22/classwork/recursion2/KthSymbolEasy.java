package scaler.dsa.day22.classwork.recursion2;

import java.util.ArrayList;

public class KthSymbolEasy {
//	Q1. Kth Symbol - Easy
//	Problem Description
//
//	On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
//
//	Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
//
//	Problem Constraints
//
//	1 <= A <= 20
//
//	0 <= B < 2A - 1
//
//	Input Format
//
//	First argument is an integer A.
//
//	Second argument is an integer B.
//
//	Output Format
//
//	Return an integer denoting the Bth indexed symbol in row A.
	public static void main(String[] args) {
		 int A = 3;
		 int B = 0;
		 int solve = solve(A, B);
		 System.out.println(solve);
	}
	  static ArrayList<Integer> A_th_Row(int A) {
	        if(A == 1){
	            ArrayList<Integer> v2 = new ArrayList<Integer>();
	            v2.add(0);
	            return v2;   
	        }
	        ArrayList<Integer> v1 = A_th_Row(A - 1);
	        ArrayList<Integer> v2 = new ArrayList<Integer>();
	        for(int i = 0 ; i < v1.size(); i++){
	            if(v1.get(i) == 0){
	                v2.add(0);
	                v2.add(1);
	            }
	            else{
	                v2.add(1);
	                v2.add(0);
	            }
	        }
	        return v2;
	    }
	    public static int solve(int A, int B) {
	        return A_th_Row(A).get(B);
	    }
}

//Example Input
//
//Input 1:
//
// A = 3
// B = 0
//
//Input 2:
//
// A = 4
// B = 4
//
//Example Output
//
//Output 1:
//
// 0
//
//Output 2:
//
// 1
//
//Example Explanation
//
//Explanation 1:
//
// Row 1: 0
// Row 2: 01
// Row 3: 0110
//
//Explanation 2:
//
// Row 1: 0
// Row 2: 01
// Row 3: 0110
// Row 4: 01101001
//
