package contest;
public class LongestMagicalSubarray {
	public static void main(String[] args) {
		int [] A=new int[] {2,6,5};  // ans 2
		//int [] A=new int[] {6,5,2,9,18}; // ans 3
		int solve = solve(A);
		System.out.println(solve);
	}
    public static int solve(int[] A) {
        int n=A.length;
        int lastIndexMatchedCounter=0;
        int lengthOfSubArray=0;
        for(int i=0;i<n;i++){
            if(A[i]%2==0 || A[i]%3==0 ){
                lastIndexMatchedCounter++;
                lengthOfSubArray=Math.max(lengthOfSubArray,lastIndexMatchedCounter);
            }else{
                lengthOfSubArray=Math.max(lengthOfSubArray,lastIndexMatchedCounter);
                lastIndexMatchedCounter=0;
            }
        }
        return lengthOfSubArray;
    }
}