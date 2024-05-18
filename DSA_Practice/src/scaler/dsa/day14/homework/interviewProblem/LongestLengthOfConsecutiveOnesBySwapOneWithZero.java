package scaler.dsa.day14.homework.interviewProblem;

public class LongestLengthOfConsecutiveOnesBySwapOneWithZero {
//	Given a binary string A. It is allowed to do at most one swap between any 0 and 1. 
	//Find and return the length of the longest consecutive 1’s that can be achieved.
	public static void main(String[] args) {
		String A="111000"; //ans 3
		//String A="101101"; // ans 4
		int ans=solve(A);
		System.out.println(ans);

	}
	
	 public  static int solve(String A) {
		 char[] charArray = A.toCharArray();
		 int n=charArray.length;
		 int maxCount =0;
		 int totalOnes=0;
		 for(int i=0;i<n;i++) {
			 if(charArray[i]=='1') {
				 totalOnes++;
			 }
		 }
		 if(totalOnes==n) {
			 return n;
		 }
		 
		 for(int i=0;i<n;i++) {
			 if(charArray[i]=='0') {
				int j=i-1;
				int l=0;
				while(j>=0 && charArray[j]=='1') {
					j--;
					l++;
				}
				
				 j=i+1;
				int r=0;
				while(j<n && charArray[j]=='1') {
					j++;
					r++;
				}
				maxCount=Math.max(maxCount, Math.min(l+r+1, totalOnes));
			 }
		 }
		 
		 return maxCount;
	   }

}

//Input Format
//
//The only argument given is string A.
//
//Output Format
//
//Return the length of the longest consecutive 1’s that can be achieved.
//
//Constraints
//
//1 <= length of string <= 1000000
//A contains only characters 0 and 1.
//
//For Example
//
//Input 1:
//    A = "111000"
//Output 1:
//    3
//
//Input 2:
//    A = "111011101"
//Output 2:
//    7

