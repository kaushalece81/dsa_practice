package scaler.day7.classwork.prefixsum;

public class PrefixSumExampleBruitForce {
	//bruitforce but will get TLE
	public static void main(String[] args) {
		int arr[]=new int[] {-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		int query[][]=new int[][] {{4,8},{3,7},{1,3},{0,4},{7,7}};
		int q=query.length;
		querySum(arr,query,n,q);
		

	}
	
	private static void querySum(int[] arr, int[][] query, int n, int q) {
		for(int i=0;i<q;i++) {
			int l=query[i][0];
			int r=query[i][1];
			int sum=0;
			for(int j=l;j<=r;j++) {
				sum= sum+arr[j];
			}
			System.out.println("sum for l="+l+" & r="+r+"::"+sum);
		}
		
	}

	

}
