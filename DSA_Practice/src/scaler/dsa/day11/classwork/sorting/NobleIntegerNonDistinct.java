package scaler.dsa.day11.classwork.sorting;

import java.util.Arrays;

public class NobleIntegerNonDistinct {

	public static void main(String[] args) {
		int arr[] = { -3,0,2,2,5,5,5,5,8,8,10,10,10,14 };
		Arrays.sort(arr);
		for(int a: arr) {
			System.out.print(a+ " ");
		}
		int count=solve(arr);
		System.out.println("\n count"+count);
		
	}
	 public static int solve(int[] A) {
		 int n = A.length;
		 int ans=0;
		 int count =0;
		 for(int i=0;i<n;i++) {
			 if(i==0 || A[i]!=A[i-1]) {
				 count=i;
			 }
			 if(count==ans) {
				 ans++;
			 }
		 }
		 return ans;
	    }
}
