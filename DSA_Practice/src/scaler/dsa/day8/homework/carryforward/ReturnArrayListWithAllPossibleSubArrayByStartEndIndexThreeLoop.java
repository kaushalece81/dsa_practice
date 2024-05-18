package scaler.dsa.day8.homework.carryforward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnArrayListWithAllPossibleSubArrayByStartEndIndexThreeLoop {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
//		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 8, 9 };
//		int[] arr = new int[] { 3, 4, 5};
		int[] arr = new int[] { 36, 63, 63,26,87,28,77,93,7};
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		ArrayList<ArrayList<Integer>> subarrays = printSubArrayByStarEndIndex(list);
		System.out.println(subarrays);


	}

	private static ArrayList<ArrayList<Integer>> printSubArrayByStarEndIndex(List<Integer> A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				 ArrayList<Integer> v = new ArrayList<>();
				for(int k=i;k<=j;k++) {
					v.add(A.get(k));
				}
				ans.add(v);
			}

		}
		return ans;
	}

}
