package scaler.dsa.day14.homework.interviewProblem;

import java.util.Arrays;

public class CheckAnagrams {
//	You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.
//
//	Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
//	Problem Constraints
//	1 <= N <= 105
//	A and B are lowercase strings
//
//
//
//	Input Format
//	Both arguments A and B are a string.
//
//
//
//	Output Format
//	Return 1 if they are anagrams and 0 if not



	public static void main(String[] args) {
		String A="secure";
		String B="rescue";
//		String A="cat";
//		String B="bat";
		int solve = solve(A,B);
		System.out.println(solve);

	}

	public static int solve(String A, String B) {
		int ans=0;
		char[] charArrayA = A.toCharArray();
		int sizeA = charArrayA.length;
		
		char[] charArrayB = B.toCharArray();
		int sizeB = charArrayB.length;
		
		if(sizeA!=sizeB) {
			return ans;
		}
		Arrays.sort(charArrayA);
		String sortedA = new String(charArrayA);
		Arrays.sort(charArrayB);
		String sortedB = new String(charArrayB);
		if(sortedA.equals(sortedB)) {
			ans=1;
		}
		return ans;
		
    }
}

//Example Input
//Input 1:
//
//A = "cat"
//B = "bat"
//
//Input 2:
//
//A = "secure"
//B = "rescue"
//
//
//
//Example Output
//Output 1:
//
//0
//
//Output 2:
//
//1
//
//
//
//Example Explanation
//For Input 1:
//
//The words cannot be rearranged to form the same word. So, they are not anagrams.
//
//For Input 2:
//
//They are an anagram.

