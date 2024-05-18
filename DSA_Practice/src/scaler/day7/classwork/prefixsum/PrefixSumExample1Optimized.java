package scaler.day7.classwork.prefixsum;

public class PrefixSumExample1Optimized {

	public static void main(String[] args) {
		int arr[]=new int[] {-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		int query[][]=new int[][] {{4,8},{3,7},{1,3},{0,4},{7,7}};
		int q=query.length;
		long[] longArray=querySum(arr,query,n,q);
		for(long lo:longArray) {
			System.out.print(lo+" ");
		}

	}

	private static long[] querySum(int[] arr, int[][] query, int n, int q) {
		//logic to calculate prefix sum
		int prefix [] =new int[n];
		prefix[0]=arr[0];
		for(int i=1;i<n;i++) {
				prefix[i] = prefix[i - 1] + arr[i];
		}
		
		long [] longArray=new long[q];
		for(int i=0;i<q;i++) {
			int l=query[i][0];
			int r=query[i][1];
			int sum=0;
			if(l==0) {
				sum=prefix[r];
			}else {
				sum=prefix[r]-prefix[l-1];
			}
			longArray[i]=sum;
			System.out.println("sum for l="+l+" & r="+r+"::"+sum);

		}
		return longArray;

		
	}

}
