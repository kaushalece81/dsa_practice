package scaler.day6.homework.arrays.rotate.ktimes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodPairBruitForceApproach {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		int solve = solve(l, 7);
		System.out.println(solve);
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int l = A.size() ;
		int goodPair = 0;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if ((A.get(i) + A.get(j)) == B) {
					goodPair++;
				}
			}
		}
		return goodPair;
	}
}
