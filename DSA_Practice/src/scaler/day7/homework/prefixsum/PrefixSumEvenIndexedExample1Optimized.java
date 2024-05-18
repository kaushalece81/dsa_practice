package scaler.day7.homework.prefixsum;

public class PrefixSumEvenIndexedExample1Optimized {
//bruitforce but will get TLE
	public static void main(String[] args) {
		int arr[]=new int[] {2,3,1,6,4,5};
		int n=arr.length;
		int query[][]=new int[][] {{1,3},{2,5},{0,4},{3,3}};
		int q=query.length;
		querySum(arr,query,n,q);
		

	}

	private static void querySum(int[] arr, int[][] query, int n, int q) {
		//logic to calculate even prefix sum
		int [] prefix =new int[n];
		prefix[0]=arr[0];
		for(int i=1;i<n;i++) {
			if (i % 2 == 0) {
				prefix[i] = prefix[i - 1] + arr[i];
			}else {
				prefix[i] = prefix[i - 1];
			}
		}
		//[2, 2, 3, 3, 7, 7]
		for(int i=0;i<q;i++) {
			int l=query[i][0];
			int r=query[i][1];
			int sum=0;
			if(l==0) {
				sum=prefix[r];
			}else {
				sum=prefix[r]-prefix[l-1];
			}
			System.out.println("sum for l="+l+" & r="+r+"::"+sum);
		}
		
	}
}
