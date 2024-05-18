package practice.repeat;

import java.util.Arrays;
import java.util.List;

public class GoodPairWithHashMap {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		int pair=pairsolve(list,7);
		System.out.println(pair);

	}

	private static int pairsolve(List<Integer> list, int target) {
		int goodPair=0;
		int size = list.size();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				int sum=list.get(i)+list.get(j);
				if(sum==target) {
					goodPair++;
				}
			}
		}
		return goodPair;
		
	}

}
