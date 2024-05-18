package scaler.day6.homework.arrays.rotate.ktimes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SumMaxMinElement {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(1);
		int solve = solve(l);
		System.out.println(solve);
	}

	public static int solve(ArrayList<Integer> A) {
		int i=0;
		int l = A.size() ;
		int min=-1;
		int max=0;
		Collections.sort(A);
		min=A.get(i);
		max=A.get(l-1);
		return min+max;
	}
}
