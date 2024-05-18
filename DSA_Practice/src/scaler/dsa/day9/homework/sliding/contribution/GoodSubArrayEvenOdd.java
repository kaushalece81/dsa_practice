package scaler.dsa.day9.homework.sliding.contribution;

public class GoodSubArrayEvenOdd {
//	Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
//		1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
//		2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
//		Your task is to find the count of good subarrays in A.
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int B = 4;
		int solve = solve(arr, B);
		System.out.println("\n solve=" + solve);
	}

	public static int solve(int[] A, int B) {
		int n = A.length;
		int countEven = 0;
		int countOdd = 0;
		int[] prefixSum = new int[n];
		prefixSum[0] = A[0];
		for (int i = 1; i < n; i++) {
				prefixSum[i] = prefixSum[i - 1] + A[i];
		}

		System.out.println("prefix sum");
		for (int i = 0; i < n; i++) {
			System.out.print(prefixSum[i] + " ");
		}
System.out.println();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				int l = i;
				int r = j;
				sum = (l == 0) ? prefixSum[r] : (prefixSum[r] - prefixSum[l - 1]);
				System.out.println("sum for l="+l+" & r="+r+"::sum="+sum);
				if ((r-l+1)%2==0 && sum < B) {
					countEven++;
				}
				if ((r-l+1)%2!=0 &&sum > B) {
					countOdd++;
				}
			}
		}
		System.out.println("countEven="+countEven);
		System.out.println("countOdd="+countOdd);
		return countEven+countOdd;
	}
//	 input
//	 A = [1, 2, 3, 4, 5]
//			 B = 4

//	 Output 1:
//
//		 6
//		 Even length good subarrays = {1, 2}
//	 Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5} 

	
	//scaler complete solution
	//public int solve(int[] A, int B) {
//	    int n = A.length;
//	    int pref[] = new int[n];
//	    pref[0] = A[0];
//	    int ans = 0;
//	    for(int i = 1 ; i < n ; i++){
//	        pref[i] = pref[i - 1] + A[i];
//	    }
//	    for(int i = 0 ; i < n ; i++){
//	        for (int j = i ; j < n ; j++){
//	            int sz = j - i + 1;
//	            int sum;
//	            if(i == 0){
//	                sum = pref[j];
//	            }
//	            else{
//	                sum = pref[j] - pref[i - 1];
//	            }
//	            if(sz % 2 == 0 && sum < B)ans++;
//	            if(sz % 2 == 1 && sum > B)ans++;
//	        }
//	    }
//	    return ans;
	//}
	
}
