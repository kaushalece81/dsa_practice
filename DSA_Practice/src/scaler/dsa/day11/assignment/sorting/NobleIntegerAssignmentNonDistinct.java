package scaler.dsa.day11.assignment.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleIntegerAssignmentNonDistinct {
//	Given an integer array A, find if an integer p exists in the array 
//	\such that the number of integers greater than p in the array equals p.
	public static void main(String[] args) {
		//int arr[] = { 3, 2, 1, 3};
		 //int arr[] = { 6,7,5};
		//int arr[] = { 5, 6, 2 };
		// arr[] = { 6,1,0,0,0 };
		int arr[] = { 0,0,0,-1 };
		//int arr[] = { -1,-2,0,0,0,-3 };

		// 1 2 3 3
		int count = solve(arr);
		System.out.println("\n count=" + count);
		List<Integer> list=new ArrayList<>(Arrays.stream(arr).boxed().toList());
		int count2 = solve2(list);
		System.out.println("\n count2=" + count2);

	}

	 public static int solve2(List<Integer> A) {
	        Collections.sort(A);
	        int size = A.size();
	        for(int i = 0; i < size; i++){
	        	while(i+1<size && A.get(i)==A.get(i+1))
	        		i++;
	        	if(A.get(i) == size-1-i)
	        		return 1;
	        }
	        return -1;
	    }

	public static int solve(int[] A) {
		Arrays.sort(A);
		System.out.println("Ascending sorted array");
		 for(int a: A) {
				System.out.print(a+ " ");
			}
		 System.out.println("\nDescending sorted array");
		reverseSort(A);
		 for(int a: A) {
				System.out.print(a+ " ");
			}
		int n = A.length;
		int ans = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0 || A[i] != A[i - 1]) {
				count = i;
			}
			if (count == A[i] ) {
				ans++;
			}
			System.out.println("\n"+"i="+i+" A[i]=" + A[i] + "count=" + count + "ans=" + ans);
		}
		if (ans == 0) {
			return -1;
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
// A = [3, 2, 1, 3]
//
//Input 2:
//
// A = [1, 1, 3, 3]
//
//
//
//Example Output
//
//Output 1:
//
// 1
//
//Output 2:
//
// -1
//
//
//
//Example Explanation
//
//Explanation 1:
//
// For integer 2, there are 2 greater elements in the array..
//
//Explanation 2:
//
// There exist no integer satisfying the required conditions.
