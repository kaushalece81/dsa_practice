package scaler.dsa.day14.homework.interviewProblem;

public class LongestLengthOfConsecutiveOnesByReplace {
//	Given a binary string A. It is allowed to do at most one replace only one 0 with 1. 
	//Find and return the length of the longest consecutive 1’s that can be achieved.
	public static void main(String[] args) {
		String A="11011011";  // ans 5
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
				maxCount=Math.max(maxCount, l+r+1);
			 }
		 }
		 
		 return maxCount;
	   }

}

