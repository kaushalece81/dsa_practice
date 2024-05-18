package scaler.day6.homework.arrays.rotate.ktimes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RotateKTimes {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
		l.add(2);
		l.add(5);
		l.add(6);
		// ArrayList<Integer> solve = solve(l, 2,3);
		 ArrayList<Integer> solve = solve(l, 0,2);
		System.out.println(solve);
	}
	public static  ArrayList<Integer>  solve(ArrayList<Integer> A, int B, int C) {
		int n=A.size();
		if(B>=n) {
			B=B%n;
		}
		if(C>=n) {
			C=C%n;
		}
		reverse(A, n,B,C) ;
		return A;
	}
	
	static  ArrayList<Integer>  reverse(ArrayList<Integer> A, int n,int l,int r) {
		int i=l,j=r;
		while(i<j) {
			int temp=A.get(i);
			A.set(i, A.get(j));
			A.set(j, temp);
			i++;
			j--;
		}
		return A;
	}
}
