package scaler.dsa.day8.homework.carryforward;

import java.util.HashSet;
import java.util.Set;

public class PrintCountAllPossibleSubArrayWithUniqueElementByStartEndIndexThreeLoop {
// Bruit force TC O(n^3)
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 3 };
		int set = printSubArrayByStarEndIndex(arr);
		System.out.println(set);
	}
//bruit force O(n^3)
//	private static int printSubArrayByStarEndIndex(int[] A) {
//		int length=A.length;
//		List<List<Integer>> list = new ArrayList<>();
//		for (int i = 0; i < length; i++) {
//			for (int j = i; j < length; j++) {
//				List<Integer> subSet = new ArrayList<>();
//				for (int k = i; k <= j; k++) {
//					if (!subSet.contains(A[k])) {
//						subSet.add(A[k]);
//					} else {
//						subSet = null;
//						break;
//					}
//				}
//				if (subSet != null) {
//					list.add(subSet);
//				}
//			}
//		}
//		return list.size();
//	}
	//O(n^2)
	
///	Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and told you to find the number of subarrays of A, that have unique elements.
//	Since the number of subarrays could be large, return value % 109 +7.
	// { 1, 1, 3 }
	public static int printSubArrayByStarEndIndex(int[] A) {
        Set<Integer> hs = new HashSet<>();
        long ans = 0;
        int N = A.length, l = 0;
        for(int r = 0; r < N; r++) {
            // check if A[r] is already there in the present window
            while(hs.contains(A[r])) {
                hs.remove(A[l]);
                l++;
            }
            // add the subarrays ending at position r
            ans += r - l + 1;
            hs.add(A[r]);
        }
        return (int)(ans % (long)(1e9 + 7));
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
