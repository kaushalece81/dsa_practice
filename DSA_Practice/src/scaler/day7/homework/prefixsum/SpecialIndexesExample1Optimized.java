package scaler.day7.homework.prefixsum;

public class SpecialIndexesExample1Optimized {
	//an index after removing it, the sum 
	public static void main(String[] args) {
//		int arr[]=new int[] {2,3,1,4,0,-1,2,-2,10,8};
		//int arr[]=new int[] {2,1,6,4};
		int arr[]=new int[] {1,1,1};
		//3,1,4,0,-1,2,-2,10,8
		int n=arr.length;
		int index=querySum(arr,n);
		System.out.println("index::"+index);
		

	}

	private static int querySum(int[] arr, int n) {
		//logic to calculate prefix sum
		int [] prefixEven =new int[n];
		prefixEven[0]=arr[0];
		int [] prefixOdd =new int[n];
		prefixOdd[0]=0;
		for(int i=1;i<n;i++) {
			if (i % 2 == 0) {
				prefixEven[i] = prefixEven[i - 1] + arr[i];
				prefixOdd[i] = prefixOdd[i - 1];
			}else {
				prefixOdd[i] = prefixOdd[i - 1] + arr[i];
				prefixEven[i] = prefixEven[i - 1];
			}
		}
// even [2, 2, 3, 3, 3, 3, 5, 5, 15, 15]
// odd  [0, 3, 3, 7, 7, 6, 6, 4, 4, 12]
		
		int count =0;
		int sumEvenIndex=0;
		int sumOddIndex=0;
		for(int i=0;i<n;i++) {
			sumEvenIndex=(i==0?0:prefixEven[i-1])+(prefixOdd[n-1]-prefixOdd[i]);
			sumOddIndex=(i==0?0:prefixOdd[i-1])+(prefixEven[n-1]-prefixEven[i]);
			if(sumEvenIndex==sumOddIndex) {
				count++;
				System.out.println("For index::"+i +"count incremented::"+count);
			}
		}
		return count;
	}
}
