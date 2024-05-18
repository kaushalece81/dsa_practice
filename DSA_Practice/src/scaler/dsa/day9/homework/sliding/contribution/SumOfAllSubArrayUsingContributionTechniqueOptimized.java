package scaler.dsa.day9.homework.sliding.contribution;
//Return a single integer denoting the sum of all subarray sums of the given array. 
public class SumOfAllSubArrayUsingContributionTechniqueOptimized {
	public static void main(String[] args) {
		//int arr[]=new int[] {1, 2, 3};
		int arr[]=new int[] {2, 1, 3};
		long subarraySum = subarraySum(arr);
		System.out.println(subarraySum);
	}
    public static long subarraySum(int[] A) {
        int n=A.length;
        long total=0;
        for(int i=0;i<n;i++){
            total=total+(long)A[i]*(i+1)*(n-i);
        }
        return total;
    }
}