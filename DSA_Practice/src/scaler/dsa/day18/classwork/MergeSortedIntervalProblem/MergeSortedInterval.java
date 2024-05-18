package scaler.dsa.day18.classwork.MergeSortedIntervalProblem;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedInterval {



	public static void main(String[] args) {
		int [][] A=new int[][] { {0,2},{1,4},{5,6},{6,8},{7,10},{8,9},{12,14} };  // ans {{0,4},{5,10},{12,14}}
		List<List<Integer>> mergeSortedInterval = mergeSortedInterval(A);
		System.out.println(mergeSortedInterval);
		List<List<Integer>> Ar=new ArrayList<>();
		Ar.add(List.of(0,2));
		Ar.add(List.of(1,4));
		Ar.add(List.of(5,6));
		Ar.add(List.of(6,8));
		Ar.add(List.of(7,10));
		Ar.add(List.of(8,9));
		Ar.add(List.of(12,14));
		
		ArrayList<ArrayList<Integer>> mergeSortedInterval1 = mergeSortedIntervalArrayList(Ar);
		System.out.println(mergeSortedInterval1);
	}
	public static List<List<Integer>> mergeSortedInterval(int [][] A){
		int n = A.length;
		List<List<Integer>> ans=new ArrayList<>();
		int currentStartIndex=A[0][0];
		int currentEndIndex=A[0][1];
		for(int i=0;i<n;i++) {
			if(A[i][0]>currentEndIndex) {
				ans.add(List.of(currentStartIndex,currentEndIndex));
				currentStartIndex=A[i][0];
				currentEndIndex=A[i][1];
			}else {
				currentEndIndex=Math.max(currentEndIndex, A[i][1]);
			}
		}
		ans.add(List.of(currentStartIndex,currentEndIndex));
		return ans;// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<ArrayList<Integer>> mergeSortedIntervalArrayList(List<List<Integer>> A){
		int n = A.size();
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		int currentStartIndex=A.get(0).get(0);
		int currentEndIndex=A.get(0).get(1);
		for(int i=0;i<n;i++) {
			if(A.get(i).get(0)>currentEndIndex) {
				ArrayList<Integer> list=new ArrayList<>();
				list.add(currentStartIndex);
				list.add(currentEndIndex);
				ans.add(list);
				currentStartIndex=A.get(i).get(0);
				currentEndIndex=A.get(i).get(1);
			}else {
				currentEndIndex=Math.max(currentEndIndex, A.get(i).get(1));
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		list.add(currentStartIndex);
		list.add(currentEndIndex);
		ans.add(list);
		return ans;
	}
	
//	public List<List<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
//        int n = A.size();
//		List<List<Integer>> ans=new ArrayList<>();
//		int currentStartIndex=A.get(0).get(0);
//		int currentEndIndex=A.get(0).get(1);
//		for(int i=0;i<n;i++) {
//			if(A.get(i).get(0)>currentEndIndex) {
//				ans.add(List.of(currentStartIndex,currentEndIndex));
//				currentStartIndex=A.get(i).get(0);
//				currentEndIndex=A.get(i).get(1);
//			}else {
//				currentEndIndex=Math.max(currentEndIndex, A.get(i).get(1));
//			}
//		}
//		ans.add(List.of(currentStartIndex,currentEndIndex));
//		return ans;
//    }

}
