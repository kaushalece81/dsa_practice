package scaler.dsa.day23.classwork.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllParenthesesII {
//	Q1. Generate all Parentheses II
//	Problem Description
//
//	Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.
//
//	Problem Constraints
//
//	1 <= A <= 10
//
//	Input Format
//
//	First and only argument is integer A.
//
//	Output Format
//
//	Return a sorted list of all possible parenthesis.

	public static void main(String[] args) {
		int A = 3;
		 ArrayList<String> generateParenthesis = generateParenthesis(A);
		System.out.println(generateParenthesis);
	}

	static ArrayList<String> ans;

	// cnt denotes remaining open brackets (
	// dif denotes the difference between open and closed brackets
	static void solve(int cnt, int dif, int n, String s) {
		if (n == 0) {
			ans.add(s);
			return;
		}
		// Now we have 2 options. We can either add '(' to the string or add ')' to the
		// string.
		// Option 1. Add '('
		if (cnt > 0)
			solve(cnt - 1, dif + 1, n - 1, s + '(');
		// Option 2. Add ')'
		if (dif > 0)
			solve(cnt, dif - 1, n - 1, s + ')');
	}

	public static ArrayList<String> generateParenthesis(int A) {
		ans = new ArrayList<>();
		solve(A, 0, 2 * A, "");
		return ans;
	}
}

//Example Input
//
//Input 1:
//
//A = 3
//
//Input 2:
//
//A = 1
//
//
//
//Example Output
//
//Output 1:
//
//[ "((()))", "(()())", "(())()", "()(())", "()()()" ]
//
//Output 2:
//
//[ "()" ]
//
//
//
//Example Explanation
//
//Explanation 1:
//
// All paranthesis are given in the output list.
//
//Explanation 2:
//
// All paranthesis are given in the output list.
