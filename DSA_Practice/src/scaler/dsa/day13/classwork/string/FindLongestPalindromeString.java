package scaler.dsa.day13.classwork.string;

import java.util.HashMap;
import java.util.Map;

//Given a string A of size N, find and return the longest palindromic substring in A.
//
//Substring of string A is A[i...j] where 0 <= i <= j < len(A)
//
//Palindrome string:
//A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
//
//Incase of conflict, return the substring which occurs first ( with the least starting index).
public class FindLongestPalindromeString {
	public static void main(String[] args) {
		//String str = "anamadamshe";
		String str = "aaabaaa";
		String ans = longestPalindromeSubstring(str);
		System.out.println(ans);

	}

	

// TC O(n^3)  SC (1)
    public static String longestPalindromeSubstring(String A) {
    	char[] charArray = A.toCharArray();
    	int size=charArray.length;
    	int ans=0;
    	Map<Integer,String> map=new HashMap<>();
    	for(int i=0;i<size;i++) {
    		for(int j=i;j<size;j++) {
    			if(isPalindrome(charArray,i,j)) {
    				ans=Math.max(ans, j-i+1);
    				if(!map.containsKey(ans)) {
    					map.put(ans, A.substring(i, j+1));
    				}
    			}
    		}
    	}
    	return map.get(ans);
    }
	private static boolean isPalindrome(char[] charArray, int i, int j) {
		while(i<j) {
			if(charArray[i]!=charArray[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

//Example Input
//Input 1:
//
//A = "aaaabaaa"
//
//Input 2:
//
//A = "abba
//
//
//
//Example Output
//Output 1:
//
//"aaabaaa"
//
//Output 2:
//
//"abba"
//
//
//
//Example Explanation
//Explanation 1:
//
//We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
//
//Explanation 2:
//
//We can see that longest palindromic substring is of length 4 and the string is "abba".


