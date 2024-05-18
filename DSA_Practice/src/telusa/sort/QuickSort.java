package telusa.sort;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 5,6,2,3,1 };
		int length = arr.length;
		System.out.println("Array Before sorting");
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
		InsertionSorting(arr);
		
		System.out.println("\nArray After sorting");
		for(int a: arr) {
			System.out.print(a+" ");
		}

	}

	private static void InsertionSorting(int arr[]) {
		//time complexity Bsest Case O(nlogn)  in worst case it goes to O(n2)
		// till now in bubble, selecction,insertion sort we were performing operation on entire list
		// now in quick sort we divide and conquer
		// First divide the problem into multiple things and then solve the subproblem individualy
		//Quick sort works with recursion to solve sub problem
		//Find the pivot We use pivot the value which is at correct position in the array here to divide the array. We divide the array into tree like structure
// we need variable   pi  is pivot
		// we need i, j
		// l and h   low and high value   low at left first value and h is at last value
		// lets arr 5,3,6,1,4,2  and consider pi=2  last value
		// in starting i is at -1 index and j will be at 0 index
		// j will start at low
		//for(int j=low;j<high;j++) {
		// if(arr[j]<pivot){ 
		// i++
		// swap(arr[j],arr[i])
		// } // for loop ends
		// swap(arr[i+1], arr[high])   pivot value goes to right place
		



		int length=arr.length;
		int steps=0;
		///5,6,2,3,1
		for(int i=1;i<length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]> key) { 
				steps++;
//				j = shift(arr, j);
			}
			arr[j+1]=key;
//			System.out.println("\nArray while sorting");
//			for(int a: arr) {
//				System.out.print(a+" ");
//			}
		}
		System.out.println("\n\nSteps Taken for sorting:: "+steps);
	}

	
}
