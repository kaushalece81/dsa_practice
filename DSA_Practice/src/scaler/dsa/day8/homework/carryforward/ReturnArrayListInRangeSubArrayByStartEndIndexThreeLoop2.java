package scaler.dsa.day8.homework.carryforward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnArrayListInRangeSubArrayByStartEndIndexThreeLoop2 {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
//		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 8, 9 };
		int[] arr = new int[] { 4, 3, 2, 6 };
		// int[] arr = new int[] { 36, 63, 64,26,87,28,77,93,7};
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		int startIndex = 1;
//		int endIndex=list.size();
		int endIndex = 3;
		ArrayList<Integer> subarrays = printSubArrayByStarEndIndex(list, startIndex, endIndex);
		System.out.println(subarrays);

	}

	private static ArrayList<Integer> printSubArrayByStarEndIndex(List<Integer> A, int startIndex, int endIndex) {
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = startIndex; i <= endIndex; i++) {
			ans.add(A.get(i));
		}
		return ans;
	}

}
