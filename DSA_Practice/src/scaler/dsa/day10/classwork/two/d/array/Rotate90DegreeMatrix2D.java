package scaler.dsa.day10.classwork.two.d.array;

import java.util.Arrays;
import java.util.Collections;

public class Rotate90DegreeMatrix2D {

	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,2},
			{3,4}
			};
		
//		int arr[][]=new int[][] {
//			{1,2,3},
//			{4,5,6,},
//			{7,8,9}
//			};
			
			int arrRotate[][]=	rotateMatrix90Degree(arr);
			//System.out.println(Arrays.deepToString(arrRotate));
			

	}

	private static int[][] rotateMatrix90Degree(int[][] A) {
		int rowSize=A.length;
		int colSize=A[0].length;
		// Finding transpose first
		for(int i=0;i<rowSize;i++) {	
			// that means i > j below the digonal element which means j<i
			for(int j=0;j<=i-1;j++) {
				//swap(arr[i][j],arr[j][i]);
				int temp=A[i][j];
				A[i][j]=A[j][i];
				A[j][i]=temp;
			}
		}
		//System.out.println(Arrays.deepToString(A));
		// reverse each row
		for(int k=0;k<rowSize;k++) {
			reverseArray1D(A[k], rowSize);
		}
		//System.out.println(Arrays.deepToString(A));
		
		for(int i=0;i<rowSize;i++) {	
			System.out.print("[");
			for(int j=0;j<colSize;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.print("]");
		}
		
		return A;
	}

	private static void reverseArray1D(int[]A, int rowSize) {
		int i=0;
		int j=rowSize-1;
		while(i<j) {
			//swap
			int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
			i++;
			j--;
		}
	}

}
