package scaler.dsa.day10.classwork.two.d.array;

import java.util.Arrays;

public class ConvertToTranspose2DMatrix {
//	Given a 2D integer array A, return the transpose of A.
//	The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
	// A[i][j] changes to AT[j][i]
	// that means i > j below the digonal element which means j<i
	//this rule applicable for square matrix else will not work
	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			};
			System.out.print("Original matrix = ");
			System.out.println(Arrays.deepToString(arr));
			System.out.print("After transpose = ");
			
			int[][] arrTranspose=solve(arr);
			System.out.println(Arrays.deepToString(arrTranspose));

	}
	// all elements below diagonal should be swapped   ie. lower left triangle  
	//if we swap above and below diagonal both then it will return same matrix
	private static int[][] solve(int[][] arr) {
		int rowSize=arr.length;
		for(int i=0;i<rowSize;i++) {	
			// that means i > j below the digonal element which means j<i
			for(int j=0;j<=i-1;j++) {
				//swap(arr[i][j],arr[j][i]);
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		return arr;

	}
}
