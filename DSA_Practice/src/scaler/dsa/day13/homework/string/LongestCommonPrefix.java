package scaler.dsa.day13.homework.string;

public class LongestCommonPrefix {
//	Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
//
//	The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
//
//	Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
//	Problem Constraints
//
//	0 <= sum of length of all strings <= 1000000

	public static void main(String[] args) {
		//String[] A=new String[] {"abcdefgh", "aefghijk", "abcefgh"};
		 String[] A = {"flower", "flow", "flight"};
		String longestCommonPrefix = longestCommonPrefix(A);
		System.out.println(longestCommonPrefix);
	}

	public static String longestCommonPrefix(String[] A) {
		int size = A.length;
		if (A == null || size == 0) {
            return "";
        }
		
		String prefix = A[0]; // Initialize prefix with the first string
// note starting with i=1
        for (int i = 1; i < A.length; i++) {
            String currentString = A[i];

            // Compare each character of the current string with the corresponding character of the prefix
            int j = 0;
            while (j < prefix.length() && j < currentString.length() && prefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }

            // Update prefix to contain only the common characters
            prefix = prefix.substring(0, j);

            // If prefix becomes empty, there are no common characters, so return ""
            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
	}

}

//Output Format
//
//Return the longest common prefix of all strings in A.
//
//
//
//Example Input
//
//Input 1:
//
//A = ["abcdefgh", "aefghijk", "abcefgh"]
//
//Input 2:
//
//A = ["abab", "ab", "abcd"];
//
//
//
//Example Output
//
//Output 1:
//
//"a"
//
//Output 2:
//
//"ab"
//
//
//
//Example Explanation
//
//Explanation 1:
//
//Longest common prefix of all the strings is "a".
//
//Explanation 2:
//
//Longest common prefix of all the strings is "ab".
//
