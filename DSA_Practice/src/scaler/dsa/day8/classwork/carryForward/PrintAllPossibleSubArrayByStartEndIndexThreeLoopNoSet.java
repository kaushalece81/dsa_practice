package scaler.dsa.day8.classwork.carryForward;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintAllPossibleSubArrayByStartEndIndexThreeLoopNoSet {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 8, 9 };
		int startIndex = 0;
		int endIndex = 8;
		printSubArrayByStarEndIndex(arr, startIndex, endIndex);

	}

	private static void printSubArrayByStarEndIndex(int[] arr, int startIndex, int endIndex) {
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i; j < endIndex; j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
			System.out.println();

		}
	}

}
