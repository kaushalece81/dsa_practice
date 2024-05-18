package scaler.dsa.day11.classwork.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 30, 4, 6, 19, 2, 11, 9 };
		int length = arr.length;
		System.out.println("Array Before sorting");
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
		selectionSorting(arr);
		
		System.out.println("\nArray After sorting");
		for(int a: arr) {
			System.out.print(a+" ");
		}

	}

	private static void selectionSorting(int arr[]) {
		//time complexity O(n2) 
		//but its better than bubble sort in terms of swapping only once in one iteration in outer loop. 
		//find minimum element and place at starting position
		// or find maximum element and place at the last position.
		//advantages in one pass swap is done only once per iteration 
		//and swap is done in outer loop and not in inner loop hence its better than bubble sort
		//selection sort reduces the number of swap
		
		int length=arr.length;
		int minIndex=-1;
		int steps=0;
		///10, 22, 30, 4, 6, 19, 2, 11, 9
		// length-1 as last value will be already sorted after first iteration
		for(int i=0;i<length-1;i++) {
			// j=i+1 as first value will be 
			// minIndex is first element considered
			minIndex=i;
			for(int j=i+1;j<length;j++) { 
				steps++;
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			swap(arr, minIndex,i);
//			System.out.println("\nArray while sorting");
//			for(int a: arr) {
//				System.out.print(a+" ");
//			}
		}
		System.out.println("\n\nSteps Taken for sorting:: "+steps);
	}

	private static void swap(int[] arr, int minIndex, int i) {
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;
	}

}
