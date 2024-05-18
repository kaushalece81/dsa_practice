package scaler.dsa.day13.homework.string;

public class AmazingSubArray {

//	You are given a string S, and you have to find all the amazing substrings of S.
//
//	An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
//
//	Input
//
//	Only argument given is string S.
//
//	Output
//
//	Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
//
//	Constraints
//
//	1 <= length(S) <= 1e6
//	S can have special characters

	public static void main(String[] args) {
		String str = "ABEC";
		int number = solve(str);
		System.out.println(number);

	}
// Gives TLE error  bruit force
//	public static int solve(String A) {
//		char[] charArray = A.toCharArray();
//		int size = charArray.length;
//		int count=0;
//		for (int i = 0; i < size; i++) {
//			for (int j = i; j < size; j++) {
//				StringBuilder sb = new StringBuilder();
//				for (int k = i; k <= j; k++) {
//					sb.append(charArray[k]);
//				}
//				String substr=sb.toString();
//				if(substr.charAt(0)=='A' || substr.charAt(0)=='E' || substr.charAt(0)=='I' || substr.charAt(0)=='O' || substr.charAt(0)=='U'
//						|| substr.charAt(0)=='a' || substr.charAt(0)=='e' || substr.charAt(0)=='i' || substr.charAt(0)=='o' || substr.charAt(0)=='u') {
////					System.out.println(substr);
//					count++;
//				}
//			}
//
//		}
//		return count;
//	}
	
	public static int solve(String A) {
		char[] charArray = A.toCharArray();
		int size = charArray.length;
		int count=0;
		for (int i = 0; i < size; i++) {
			if(charArray[i]=='A' || charArray[i]=='E' || charArray[i]=='I' || charArray[i]=='O' || charArray[i]=='U'
					|| charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u') {
				count=(count+(size-i)%10003)%10003;
			}
		}
		//Return a single integer X mod 10003  here its not working so done above
		return count;
	}

}

//Example
//
//Input
//    ABEC
//
//Output
//    6
//
//Explanation
//    Amazing substrings of given string are :
//    1. A
//    2. AB
//    3. ABE
//    4. ABEC
//    5. E
//    6. EC
//    here number of substrings are 6 and 6 % 10003 = 6.
//
