package scaler.dsa.day13.classwork.string;

public class CheckLongestPalindromeLengthOptimized {

	public static void main(String[] args) {
		String A = "adaebcdfdcbetggte";
		int longestPalindromeOptimized = longestPalindromeSubstringOptimized(A);
		System.out.println(longestPalindromeOptimized);

	}
// TC O(n^2) SC O(1)
	public static int longestPalindromeSubstringOptimized(String A) {
		char[] ch = A.toCharArray();
		int n = ch.length;
		int maxLength = 0;
		int left = 0;
		int right = 0;
		// odd length substring palindrome scenarios note here till n
		for (int i = 0; i < n; i++) {
			left=i;
			right=i;
			while (left >= 0 && right < n) {
				if(ch[left]!=ch[right]) {
					break;
				}
				left--; /// as we are moving away from the center hence opposite movement
				right++; /// as we are moving away from the center hence opposite movement
			}
			// since when left =3 and right =11   e on both side of f matches 
			//still it will reduce left -- and increase right ++ hence left =3-1=2 and r=11+1=12  which points l to a and r to t which are not matching characters
			// we have to take l+1 and r-1 these are the two extreme end index where e characters are matched
			maxLength=Math.max(maxLength, right-left-1);// match happens from (l+1) to (r-1) //(r-1)-(l+1) +1=r-l-1
		}
		// reinitialize the left and right to zero
		left = 0;
		right = 0;
		// even length substring palindrome scenarios  note here till n-1  as left can't go beyond n-1 then no chance of right
		for (int i = 0; i < n-1; i++) {
			left=i;
			right=i+1;
			while (left >= 0 && right < n) {
				if(ch[left]!=ch[right]) {
					break;
				}
				left--; /// as we are moving away from the center hence opposite movement
				right++; /// as we are moving away from the center hence opposite movement
			}
			maxLength = Math.max(maxLength, right - left - 1);
			// match happens from (l+1) to (r-1) //(r-1)-(l+1) +1=r-l-1
		}
		return maxLength;
	}

}
