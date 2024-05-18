package scaler.dsa.day21.classwork.recursion1;
public class CheckPalindrome {
	//Q3. Check Palindrome
//	Problem Description
//
//	Write a recursive function that checks whether string A is a palindrome or Not.
//	Return 1 if the string A is a palindrome, else return 0.
//
//	Note: A palindrome is a string that's the same when read forward and backward.
//
//	Problem Constraints
//
//	1 <= |A| <= 50000
//
//	String A consists only of lowercase letters.
//
//	Input Format
//
//	The first and only argument is a string A.
//	Output Format
//
//	Return 1 if the string A is a palindrome, else return 0.
	public static void main(String[] args) {
		String A="naman";
		int solve = solve(A);
		System.out.println(solve);
	}
    public static int solve(String A) {
    	char[] charArray = A.toCharArray();
    	int length = A.length();
    	if(length<=1) {
    		return 1;
    	}
    	if(A.charAt(0)==A.charAt(length-1)) {
    		return solve(A.substring(1, length-1));
    	}
    	return 0;
    }
}

//Example Input
//
//Input 1:
//
// A = "naman"
//
//Input 2:
//
// A = "strings"
//
//
//
//Example Output
//
//Output 1:
//
// 1
//
//Output 2:
//
// 0
//
//
//
//Example Explanation
//
//Explanation 1:
//
// "naman" is a palindomic string, so return 1.
//
//Explanation 2:
//
// "strings" is not a palindrome, so return 0.
