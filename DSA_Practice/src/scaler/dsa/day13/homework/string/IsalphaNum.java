package scaler.dsa.day13.homework.string;

public class IsalphaNum {
//	You are given a function isalpha() consisting of a character array A.
//	Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
//	Problem Constraints
//
//	1 <= |A| <= 10^5



	public static void main(String[] args) {
		char[] ch= {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
		char[] ch1= {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
		int solve = solve(ch);
		System.out.println(solve);
	}
	public static int solve(char[] A) {
		int ans=0;
		for(int i=0;i<A.length;i++) {
			if((A[i] >='0' && A[i]<='9') || (A[i]>='A' &&  A[i]<='Z')|| (A[i]>='a' && A[i]<='z')) {
				ans=1;
			}else {
				ans=0;
				break;
			}
		}
		return ans;
    }

}

//Input Format
//
//Only argument is a character array A.
//
//
//
//Output Format
//
//Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.
//
//

//Example Input
//
//Input 1:
//
// A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
//
//Input 2:
//
// A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
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
// All the characters are alphanumeric.
//
//Explanation 2:
//
// All the characters are NOT alphabets i.e ('#').
