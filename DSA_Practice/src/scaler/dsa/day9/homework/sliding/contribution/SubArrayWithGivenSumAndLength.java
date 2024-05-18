package scaler.dsa.day9.homework.sliding.contribution;

public class SubArrayWithGivenSumAndLength {
	/*
	 * Given an array A of length N. Also given are integers B and C. Return 1 if
	 * there exists a subarray with length B having sum C and 0 otherwise
	 */
	public static void main(String[] args) {
//		int arr[]=new int[] {4, 3, 2, 6, 1};
//		int subArraySize=3;
//		int C=11;
		
		int arr[]=new int[] {6, 3,3,6,7,8,7,3,7};
		int subArraySize=2;
		int C=10;
//		int arr[]=new int[] {6};
//		int subArraySize=1;
//		int C=6;
		int solve = solve(arr,subArraySize, C);
		System.out.println(solve);

	}
	
	 public static int solve(int[] A, int B, int C) {
		 int n=A.length;
		 int sum=0;
         int k=B;
         // for array of size 1
         if(n==1&&n==k && C==A[0]){
             return 1;
         }
         // from 0 index to k-1 find sum
		 for(int i=0;i<=k-1;i++) {
			 sum=sum+A[i];
		 }
         for(int i=1;i<=n-k;i++) {
             int j=i+k-1;
             sum=sum+A[j]-A[i-1];
             System.out.println("sum="+sum);
             if(sum==C){
                 return 1;
             }
         }
        
         return 0;
	 }

}
