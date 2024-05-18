package worecursion;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,9,10,15};//
		int target=1;
		int start =0;
		int end= arr.length-1;
		int index = binarySearch(arr,target,start,end);
		System.out.println("Index of target "+target+ " is "+ index);

	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		int mid=0 ;
		int length=end;
		for (int i = start; i <= length; i++) {
			mid = (start + end) / 2;
			// base condition
			if (start > end) {
				return -1;
			}
			// target found in mid
			if (arr[mid] == target) {
				return mid;
			}
			// right side target exist
			if (arr[mid] < target) {
				start = mid + 1;
			}
			// left side target exist
			else {
				end = mid - 1;
			}

		}
		return mid;
	}
}
