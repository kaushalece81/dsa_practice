package scaler.dsa.day11.classwork.sorting;

import java.util.Arrays;

public class CostOFRemoval {
	/*
	 * Given an integer array A of size N. You can remove any element from the array
	 * in one operation. The cost of this operation is the sum of all elements in
	 * the array present before this operation.
	 * 
	 * Find the minimum cost to remove all elements from the array.
	 */

	public static void main(String[] args) {
		//int arr[]=new int[] {2, 1};
		int arr[]=new int[] {5};
		System.out.println("solve="+solve(arr));
		
	}
    public static int solve(int[] A) {
    	Arrays.sort(A);
    	reverseSort(A);
    	System.out.println("Array Before sorting");
		for(int a: A) {
			System.out.print(a+" ");
		}
    	int ans=0;
    	int n=A.length;
    	for(int i=0;i<n;i++) {
    		ans=ans+A[i]*(i+1);
    	}
    	return ans;
    }
    
    private static void reverseSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move indices towards the center
            start++;
            end--;
        }
    }
}


//Example Input
//
//Input 1:
//
// A = [2, 1]
//
//Input 2:
//
// A = [5]
//
//
//
//Example Output
//
//Output 1:
//
// 4
//
//Output 2:
//
// 5
//
//
//
//Example Explanation
//
//Explanation 1:
//
// Given array A = [2, 1]
// Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
// Remove 1 from the array => []. Cost of this operation is (1) = 1.
// So, total cost is = 3 + 1 = 4.
//
//Explanation 2:
//
// There is only one element in the array. So, cost of removing is 5.