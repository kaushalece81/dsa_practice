package scaler.day7.homework.prefixsum;

public class RangeSumQuery {

	public static void main(String[] args) {
		int arr[]=new int[] {-3,6,2,4,5,2,8,-9,3,1};
		int query[][]=new int[][] {{4,8},{3,7},{1,3},{0,4},{7,7}};
		long[] longArray=rangeSum(arr,query);
		for(long lo:longArray) {
			System.out.print(lo+" ");
		}

	}
    public static long[] rangeSum(int[] A, int[][] B) {
        //logic to calculate prefix sum
        int n=A.length;
		long prefix [] =new long[n];
		prefix[0]=A[0];
		for(int i=1;i<n;i++) {
				prefix[i] = prefix[i - 1] + A[i];
		}
        long [] longArray=new long[B.length];
		
		for(int i=0;i<B.length;i++) {
			int l=B[i][0];
			int r=B[i][1];
			long sum=0;
			if(l==0) {
				sum=prefix[r];
			}else {
				sum=prefix[r]-prefix[l-1];
			}
            longArray[i]=sum;
		}
        return longArray;
    }
}
