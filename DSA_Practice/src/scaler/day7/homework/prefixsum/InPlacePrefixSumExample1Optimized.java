package scaler.day7.homework.prefixsum;

public class InPlacePrefixSumExample1Optimized {
//bruitforce but will get TLE
	//in place means not increasing space complexity by declaring extra array like prefix in same array updated
	public static void main(String[] args) {
		int arr[]=new int[] {-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		int[] longArray=querySum(arr,n);
		for(int lo:longArray) {
			System.out.print(lo+" ");
		}
		//-3 3 5 9 14 16 24 15 18 19 

	}

	private static int[] querySum(int[] arr, int n) {
		//logic to calculate prefix sum
//		int prefix [] =new int[n];
//		prefix[0]=arr[0];
//		for(int i=1;i<n;i++) {
//				prefix[i] = prefix[i - 1] + arr[i];
//		}
		
		for(int i=1;i<n;i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		
		return arr;

		
	}

}
