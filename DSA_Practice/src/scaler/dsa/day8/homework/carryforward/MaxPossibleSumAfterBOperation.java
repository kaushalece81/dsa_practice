package scaler.dsa.day8.homework.carryforward;

import java.util.List;

public class MaxPossibleSumAfterBOperation {

	public static void main(String[] args) {
		int arr[] = new int[] { 5, -2, 3, 1, 2 };
		int solve = solve(arr, 3);
		System.out.println(solve);
	}	
	public static int solve(int[] A, int B) {
		int n = A.length;
		int ans=0;
		// calculate prefix sum
		int[] prefixSum = new int[n];
		prefixSum[0] = A[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + A[i];
		}
		// calculate suffix sum
		int[] suffixSum = new int[n];
		suffixSum[n - 1] = A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			suffixSum[i] = suffixSum[i + 1] + A[i];
		}
		// edge case l=0, r=b-1
		// edge case l=n-b, r=0
		ans=Math.max(prefixSum[B-1],suffixSum[n-B]);
		int sum=0;
		// other case like 1 element from left and 2 elements from right so on
		for(int i=1;i<B;i++) {
			sum=prefixSum[i-1]+suffixSum[n-(B-i)];
			ans=Math.max(sum,ans);
		}
		return ans;
    }
	
	//Method 1:
	//
	//public class Solution {
//	    public int solve(int[] A, int B) {
//	        int n = A.length;
//	        int []suff = new int[n + 1];
//	        suff[n] = 0;
//	        suff[n - 1] = A[n - 1];
//	        for(int i = n - 2; i >= 0; i--){
//	            suff[i] = A[i] + suff[i + 1];
//	        }
//	        int pref_sum = 0;
//	        int ans = suff[n - B];
//	        for(int i = 0; i < B; i++){
//	            pref_sum = pref_sum + A[i];
//	            int suff_sum = suff[n - B + (i + 1)];
//	            ans = Math.max(ans, pref_sum + suff_sum);
//	        }
//	        return ans;
//	    }
	//}

}










//Method 2:
//
//public class Solution {
//    public int solve(int[] A, int B) {
//        int n = A.length;
//        int cur = 0;
//        for(int i = 0; i < B; i++){
//            cur += A[i];
//        }
//        int back = B - 1; 
//        int ans = cur; 
//        for(int j = n - 1 ; j >= n-B; j--){
//            cur += A[j];
//            cur -= A[back];
//            back--;
//            ans = Math.max(ans, cur);
//        }
//        return ans;
//    }
//}


