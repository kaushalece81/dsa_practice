package scaler.dsa.day8.classwork.carryForward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnArrayListInRangeWithAllPossibleSubArrayByStartEndIndexThreeLoop {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
//		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 8, 9 };
		int[] arr = new int[] { 3, 4, 5};
		//int[] arr = new int[] { 36, 63, 64,26,87,28,77,93,7};
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		int startIndex=0;
//		int endIndex=list.size();
		int endIndex=1;
		ArrayList<ArrayList<Integer>> subarrays = printSubArrayByStarEndIndex(list,startIndex,endIndex);
		System.out.println(subarrays);


	}

	private static ArrayList<ArrayList<Integer>> printSubArrayByStarEndIndex(List<Integer> A, int startIndex, int endIndex) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i; j < endIndex; j++) {
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
