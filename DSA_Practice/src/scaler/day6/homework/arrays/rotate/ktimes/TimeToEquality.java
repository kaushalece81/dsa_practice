package scaler.day6.homework.arrays.rotate.ktimes;

public class TimeToEquality {

	public static void main(String[] args) {
		int arr[]=new int[] {2, 4, 1, 3, 2};
		int solve = solve(arr);
		System.out.println(solve);

	}
	    public static int solve(int[] A) {
	        int length=A.length;
	        int max=0;
	        int count=0;
	        for(int i=0;i<length;i++){
	            if(A[i]>max){
	                max=A[i];
	            }
	        }
	        for(int i=0;i<length;i++){
	            int target=max-A[i];
	            count= count+target;
	       
	        }
	        return count;
	    }


}
