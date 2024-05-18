package scaler.dsa.day8.homework.carryforward;

import java.util.ArrayList;
import java.util.List;

//Given an integer array A containing N distinct integers, 
//you have to find all the leaders in array A. An element is a leader if it is strictly greater than 
//all the elements to its right side.

public class LeaderElement {
	public static void main(String[] args) {
		//int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int arr[] = new int[] { 5, 2 };
		int[] solveArr = solve(arr);
		for (int i = 0; i < solveArr.length; i++) {
			System.out.println(solveArr[i]);
		}
	}

	public static int[] solve(int[] A) {
		int length = A.length;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			int max=A[i];
			for (int j = i + 1; j < length; j++) {
				if (A[j] > max) {
					max=A[j] ;
				}
			}
			if (max == A[i]) {
				list.add(A[i]);
			}
		}
		return list.stream().mapToInt(a -> a).toArray();
	}
}
