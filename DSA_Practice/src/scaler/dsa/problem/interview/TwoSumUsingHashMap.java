package scaler.dsa.problem.interview;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 
 */
public class TwoSumUsingHashMap {

	public static void main(String[] args) {
		int N=5;
		int arr[] = {7,6,3,8,2};
		int target = 14;
		//sample output 1 3
		StringBuilder sb=twoSum(arr, target);
		System.out.println(sb.toString());

	}

	private static StringBuilder twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) { // [0,N-1] N
			int searchElement = target - arr[i];
			if(map.containsKey(searchElement)) {
				sb.append("i="+map.get(searchElement)+", j="+i);
				break;
			}
			map.put(arr[i], i);
			//OR
//			if (map.get(searchElement) == null) {
//				map.put(arr[i], i);
//			} else {
//				sb.append("i="+map.get(searchElement)+", j="+i);
//				break;
//			}
		}
		return sb;

	}

}
