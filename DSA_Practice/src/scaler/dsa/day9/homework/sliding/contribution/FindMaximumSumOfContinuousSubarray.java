package scaler.dsa.day9.homework.sliding.contribution;

//You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
//But the sum must not exceed B. 
public class FindMaximumSumOfContinuousSubarray {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 1, 3, 4, 5 };
		int maxSubarray = maxSubarray(5, 12, arr);
		System.out.println("maxSubarray=" + maxSubarray);
//		int maxSubarray2 = maxSubarrayOptimized(5, 12, arr);
//		System.out.println("maxSubarray2=" + maxSubarray2);
		int maxSubarray1 = maxSubarrayGiven(5, 12, arr);
		System.out.println("maxSubarray1=" + maxSubarray1);
//		int arr[] = new int[] { 4 };
//		int maxSubarray = maxSubarray(1, 75, arr);
//		int arr[] = new int[] { 7,1,8,5,8,5,3,3,5 };
//		int maxSubarray = maxSubarray(9, 78, arr);
//		System.out.println("maxSubarray=" + maxSubarray);
		
		
//		int maxSubarray1 = maxSubarrayGiven(9, 78, arr);
//		System.out.println("maxSubarray1=" + maxSubarray1);
		
//		int maxSubarray2 = maxSubarrayOptimized(9, 78, arr);
//		System.out.println("maxSubarray2=" + maxSubarray2);
	}
	
//	public static int maxSubarrayOptimized(int A, int B, int[] C) {
//		int n = A;
//		int[] prefixSum = new int[n];
//		prefixSum[0] = C[0];
//		for (int i = 1; i < n; i++) {
//			prefixSum[i] = prefixSum[i - 1] + C[i];
//		}
//		int ans=0;
//		if(n==1) {
//			ans=C[0];
//		}
//		int sum=0;
//		for (int i = n-1; i >0 ; i--) {
//			if(prefixSum[i]<=B) {
//				sum=prefixSum[i];
//				ans=Math.max(ans, sum);
//				break;
//			}
//		}
//		
//		return ans;
//	}
	
	 public static int maxSubarrayGiven(int A, int B, int[] C) {
	        int ans = 0;
	        for (int i = 0; i < A; i++) {
	            int sum = 0;
	            for (int j = i; j < A; j++) {
	                sum += C[j];
	                if (sum <= B)
	                    ans = Math.max(ans, sum);
	                else break;
	            }
	        }
	        return ans;
	    }

	public static int maxSubarray(int A, int B, int[] C) {
		int n = A;
		int[] prefixSum = new int[n];
		prefixSum[0] = C[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + C[i];
		}
		int ans=0;
		if(n==1) {
			ans=C[0];
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int l=i;
				int r=j;
				int sum=0;
				if(l==0) {
					sum=prefixSum[r];
				}else {
					sum=prefixSum[r]-prefixSum[l-1];
				}
				System.out.println("l="+l+", r="+r+" sum="+sum);
				if (sum <= B) {
					ans= Math.max(ans,sum);
				}
			}
		}
		return ans;
	}
	


}
