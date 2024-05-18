package scaler.dsa.day8.classwork.carryForward;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintAllPossibleSubArrayByStartEndIndexThreeLoop {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 8, 9 };
		int startIndex = 0;
		int endIndex = arr.length;
		Set<String> set = printSubArrayByStarEndIndex(arr, startIndex, endIndex);
		System.out.println(set);
	}

	private static Set<String> printSubArrayByStarEndIndex(int[] arr, int startIndex, int endIndex) {
		Set<String> set = new LinkedHashSet<>();
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i; j < endIndex; j++) {
				StringBuilder sb=new StringBuilder();
				for(int k=i;k<=j;k++) {
					sb.append(arr[k]+" ");
				}
				set.add(sb.toString());
			}
		}
		return set;
	}

}
