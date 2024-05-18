package scaler.dsa.day13.classwork.string;

public class CheckForPalindromeStringLength {
//Find the longest palindrome
	public static void main(String[] args) {
		//String str = "anamadamshe";
		String str = "aaabaaa";
		
		char[] charArray = str.toCharArray();
		int ans = findLongestPalindromeSubstring(charArray);
		System.out.println(ans);

	}
	// TC O(n^2)*O(n)  due to n^2 for loop and n  due to isPlaindrome method
	private static int findLongestPalindromeSubstring(char[] charArray) {
		int size = charArray.length;
		int ans = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (isPalindrome(charArray, i, j)) {
					ans = Math.max(ans, j - i + 1);
				}
			}
		}
		return ans;
	}
 // TC O(n)
	private static boolean isPalindrome(char[] chArray, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			if (chArray[startIndex] != chArray[endIndex]) {
				// then definitely not palindrome
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}

}
