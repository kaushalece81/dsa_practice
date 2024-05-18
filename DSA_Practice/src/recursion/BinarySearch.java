package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,9,10,14,16,50,70};
		int target=1;
		int start =0;
		int end= arr.length-1;
		int index = binarySearch(arr,target,start,end);
		System.out.println("Index of target "+target+ " is "+ index);

	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		int mid= (start+end)/2;
		//base condition
		if(start> end) {
			return -1;
		}
		// found in mid
		if(arr[mid]==target) {
			return mid;
		}
		//right side target exist
		else if(arr[mid]<target) {
			start=mid+1;
			return binarySearch(arr,target,start,end);
		}
		//left side target exist
		else {
			end= mid-1;
			return binarySearch(arr,target,start,end);
		}
	}
}
