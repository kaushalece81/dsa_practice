package scaler.dsa.day10.homework.two.d.array;

import java.util.Arrays;

public class MatrixScalarProduct {
//	You are given a matrix A and and an integer B,
	//you have to perform scalar multiplication of matrix A with an integer B.
	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
			};
			System.out.print("MatrixScalarProduct = ");
			int[][] solve = solve(arr,2);
			System.out.println(Arrays.deepToString(solve));

	}
    public static int[][] solve(int[][] A, int B) {
    	int rowSize=A.length;
		int colSize=A[0].length;
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				A[i][j]=A[i][j]*B;
			}
		}
		return A;
    }
}

//Example Input
//
//Input 1:
//
//A = [[1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]]
//B = 2 
//
//Input 2:
//
//A = [[1]]
//B = 5 
//
//
//
//Example Output
//Output 1:
//
//[[2, 4, 6], 
//[8, 10, 12], 
//[14, 16, 18]]
//
//Output 2:
//
//[[5]]
//
//
//
//Example Explanation
//Explanation 1:
//
//==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
//
//==> [[2*1, 2*2, 2*3],
//     [2*4, 2*5, 2*6],
//     [2*7, 2*8, 2*9]]
//
//==> [[2,   4,  6], 
//     [8,  10, 12], 
//     [14, 16, 18]]
//
//Explanation 2:
//
//==> ( [[1]] ) * 5
//
//==> [[5*1]]
//
//==> [[5]]


