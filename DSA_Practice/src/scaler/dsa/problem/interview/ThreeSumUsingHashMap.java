package scaler.dsa.problem.interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * 
 * 
 */
public class ThreeSumUsingHashMap {
// Time complexity n^2  space complexity used hashmap O(n) + O(m)  used hashset
	public static void main(String[] args) {
//		int arr[] = { 7, -6, 3, 8, -1, 8, -11 };
//		int target = 0;
		int arr[] = { 2, 1, -2, 2, -1, 3, 4,5,2 };
		int target = 6;
		
		Set<String> set = threeSum(arr, target);
		System.out.println(set);

	}

	private static Set<String> threeSum(int[] arr, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) { 
			// add frequency of each element in the array
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i + 1; j < arr.length; j++) {
				int searchElement = target - (arr[i]+arr[j]);
				if(map.containsKey(searchElement)&& map.get(searchElement)>0) {
					set.add(arr[i] + " " + arr[j] + " " + searchElement);
					map.put(searchElement,map.get(searchElement)-1);
				}
			}
		}
		
		
		
		return set;

	}

}
