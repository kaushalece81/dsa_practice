package telusa.sort;

public class InsertionSort {

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
		//time complexity O(n2)  but instead of swap we perform shifting
// here we don not use swapping instead use shifting 
		// We insert value at correct position by shifting previous elements already placed before to form correct order
// we divide array in two parts sorted and unsorted array left array[first element] we consider is already sorted
// eg SEODA   consider S is already sorted now check [from 2nd element in an array]E is at correct location by comparing S and E
// temp=E  then check E and S and try to place at correct location by first shifting S to index 1 then by inserting E at 0 index
// ESODA
// Repeat the steps again now start from index 2 
// temp=O then check O and S try to place at correct location by shifting S to index 2 then check O with E then we get O should be at index 1
// EOSDA
		
// arr 
//3,6,2,1,5
//j,i
//		i=1   //second element  index  which is first element 6 on unsorted array
//		j= i-1 // first index element value 3 which is considered already sorted
//		key=  arr[i] =6
//// for(i=1; i< n; i++){
//		key= arr[i];
//		j=i-1;
//		while(arr[j]> key && j>=0) {
//			arr[j+1]= arr[j]
//			j=j-1
//		}
//		arr[j+1]=key


		int length=arr.length;
		int steps=0;
		///5,6,2,3,1
		// note i starts with 2nd element and j starts with first element
		// i starts with 1 as we considered arr[0] is already sorted initially for starting
		// then i and j are shifted to right hence key also gets shifted to right in every iteration
		for(int i=1;i<length;i++) {
			int key = arr[i];
			int j=i-1;
			// using while make more sense as we want to iterate
			// based on condition and not based on number of iteration
			while(j>=0 && arr[j]> key) { 
				steps++;
				j = shift(arr, j);
				System.out.println();
			}
			// after while loop ends the j becomes -1 hence in below step we are using arr[j+1]
			// then assign key value to it
			arr[j+1]=key;
//			System.out.println("\nArray while sorting");
//			for(int a: arr) {
//				System.out.print(a+" ");
//			}
		}
		System.out.println("\n\nSteps Taken for sorting:: "+steps);
	}

	private static int shift(int[] arr, int j) {
		arr[j+1]= arr[j];
		j=j-1;
		return j;
	}

}
