package contest;
public class SumOfAllPossibleSubArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		long subarraySum = subarraySum(arr);
		System.out.println(subarraySum);
	}
    public static long subarraySum(int[] A) {
    	  long total=0;
          int n=A.length;
          for(int i=0;i<n;i++){
              total=total +(long) A[i]*(i+1)*(n-i);
          }
          return total;
    }
}
