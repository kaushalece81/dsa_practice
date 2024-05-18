package scaler.dsa.day10.homework.two.d.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllAntiDiagonalElementsInSquareMatrix {


	
	public static void main(String[] args) {
//		int arr[][]=new int[][] {
//			{1,2,3,4},
//			{5,6,7,8},
//			{9,10,11,12}
//			};
		
		int arr[][]=new int[][] {
			{1,2,3},
			{4,5,6,},
			{7,8,9}
			};
			
			
			int arrDiagonal[][]=solve(arr);
			String arrayString = Arrays.deepToString(arrDiagonal);
			System.out.println("arrayString: "+arrayString);
			
//			List<List<Integer>> solve = solve(arr);
//			System.out.print("All Anti Diagonal elements = ");
//			System.out.println(solve);
//			int arrDiagonal[][]=new int[solve.size()][] ;
//			for(int i=0;i<solve.size();i++) {
//				arrDiagonal[i]=solve.get(i).stream().mapToInt(Integer::intValue).toArray();
//			}
//			System.out.print("All Anti Diagonal elements = "+arrDiagonal);
			
			

	}
	
private static int[][] solve(int[][] A) {
		
		int rowSize=A.length;
		int colSize=A[0].length;
		List<List<Integer>> listDiagonal=new ArrayList<>();
		for (int c = 0; c < colSize; c++) {
			int i=0;
			int j=c;
			List<Integer> list=new ArrayList<>();
			while (i < rowSize && j>=0) {
				System.out.print(A[i][j] + " ");
				list.add(A[i][j]) ;
				i++;
				j--;
			}
			int size=list.size();
			for(int index=0;index<(colSize-size);index++)
			{
				list.add(0);
			}
			listDiagonal.add(list);
			System.out.println();
		}
		
		for (int r = 1; r < rowSize; r++) {
			int i=r;
			int j=colSize-1;
			List<Integer> list=new ArrayList<>();
			while (i < rowSize && j>=0) {
				System.out.print(A[i][j] + " ");
				list.add(A[i][j]) ;
				i++;
				j--;
			}
			int size=list.size();
			for(int index=0;index<(colSize-size);index++)
			{
				list.add(0);
			}
			listDiagonal.add(list);
			System.out.println();
		}
		System.out.println(listDiagonal);
		int arrDiagonal[][]=new int[listDiagonal.size()][] ;
		for(int i=0;i<listDiagonal.size();i++) {
			arrDiagonal[i]=listDiagonal.get(i).stream().mapToInt(Integer::intValue).toArray();
		}
		
		return arrDiagonal;
	}

}
