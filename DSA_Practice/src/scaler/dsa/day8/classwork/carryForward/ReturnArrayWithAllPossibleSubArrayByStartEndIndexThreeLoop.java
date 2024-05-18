package scaler.dsa.day8.classwork.carryForward;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReturnArrayWithAllPossibleSubArrayByStartEndIndexThreeLoop {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
//		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 8, 9 };
//		int[] arr = new int[] { 3, 4, 5};
		int[] arr = new int[] { 36, 63, 63,26,87,28,77,93,7};
		int startIndex = 0;
		int endIndex = arr.length;
		int[][] subarrays = printSubArrayByStarEndIndex(arr, startIndex, endIndex);
		 System.out.print("[");
	        for (int i = 0; i < subarrays.length; i++) {
	            System.out.print("[");
	            for (int j = 0; j < subarrays[i].length; j++) {
	                System.out.print(subarrays[i][j]);
	                if (j < subarrays[i].length - 1) {
	                    System.out.print(" ");
	                }
	            }
	            System.out.print("]");
	            if (i < subarrays.length - 1) {
	                System.out.print(" ");
	            }
	        }
	        System.out.print("]");

	}

	private static int [][] printSubArrayByStarEndIndex(int[] arr, int startIndex, int endIndex) {
		int totalSubArray=(int)endIndex*(endIndex+1)/2;
		int [][] arrTwoD=new int [totalSubArray][];
		int subArrayIndex=0;
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i; j < endIndex; j++) {
				 int subarraySize = j - i + 1;
				 arrTwoD[subArrayIndex] = new int[subarraySize];
				for(int k=i,l=0;k<=j;k++,l++) {
					arrTwoD[subArrayIndex][l]=arr[k];
				}
				subArrayIndex++;
			}
		}
		return arrTwoD;
	}

}
