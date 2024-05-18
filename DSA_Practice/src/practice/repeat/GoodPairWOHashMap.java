package practice.repeat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GoodPairWOHashMap {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		int pair=pairsolve(list,7);
		System.out.println(pair);

	}

	private static int pairsolve(List<Integer> list, int target) {
		int goodPair=0;
		int size = list.size();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<size;i++) {
				int searchElement=target-list.get(i);
				if(map.containsKey(searchElement)) {
					goodPair++;
				}
				map.put(list.get(i), i);
		}
		return goodPair;
		
	}

}
