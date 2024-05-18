package scaler.dsa.day8.homework.carryforward;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintAllPossibleSubArrayByStartEndIndexThreeLoop {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 3 };
		int startIndex = 0;
		int endIndex = arr.length;
		List<List<Integer>> set = printSubArrayByStarEndIndex(arr, startIndex, endIndex);
		System.out.println(set);
	}

	private static List<List<Integer>> printSubArrayByStarEndIndex(int[] arr, int startIndex, int endIndex) {
		List<List<Integer>> list = new ArrayList<>();
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i; j < endIndex; j++) {
				List<Integer> subSet = new ArrayList<>();
				for (int k = i; k <= j; k++) {
					if (!subSet.contains(arr[k])) {
						subSet.add(arr[k]);
					} else {
						subSet = null;
						break;
					}
				}
				if (subSet != null) {
					list.add(subSet);
				}
			}
		}
		return list;
	}

}
