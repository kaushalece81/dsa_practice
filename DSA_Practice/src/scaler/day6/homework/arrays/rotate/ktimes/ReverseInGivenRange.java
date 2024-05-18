package scaler.day6.homework.arrays.rotate.ktimes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReverseInGivenRange {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
//		l.add(2);
//		l.add(5);
//		l.add(6);
		 ArrayList<Integer> solve = solve(l, 2);
		 //ArrayList<Integer> solve = solve(l, 1);
		System.out.println(solve);
	}

	public static  ArrayList<Integer>  solve(ArrayList<Integer> A, int B) {
		int n=A.size();
		if(B>=n) {
			B=B%n;
		}
		reverse(A, n,0,n-1) ;
		reverse(A, n,0,B-1) ;
		reverse(A, n,B,n-1) ;
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
