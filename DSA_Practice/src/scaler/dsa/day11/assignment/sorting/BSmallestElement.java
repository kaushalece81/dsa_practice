package scaler.dsa.day11.assignment.sorting;
public class BSmallestElement {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public static void main(String[] args) {
//		int arr[]=new int[] {2, 1, 4, 3, 2};
		int arr[]=new int[] {8,16,80,55,32,8,38,40,65,18,15,45,50,38,54,52,23,74,81,42,28,16,66,35,91,36,44,9,85,58,59,49,75,20,87,60,17,11,39,62,20,17,46,26,81,92};
		int count=kthsmallest( arr, 9);
		System.out.println("\n count="+count);
	}
	 public static int kthsmallest(final int[] A, int B) {
	        int n=A.length;
	        int minIndex=-1;
	        for(int i=0;i<n-1;i++){
	            minIndex=i;
	            for(int j=i+1;j<n;j++){
	                if(A[minIndex]>A[j]){
	                    minIndex=j;
	                }
	            }
	            swap(A,minIndex,i);

	        }
	        for(int a:A) {
	        	System.out.print(a + " " );
	        }
	        return A[B-1];
	    }
	    private static void swap(int[] arr, int minIndex, int i) {
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
}
