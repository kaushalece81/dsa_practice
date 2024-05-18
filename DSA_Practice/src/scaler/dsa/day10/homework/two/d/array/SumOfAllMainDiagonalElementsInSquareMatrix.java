package scaler.dsa.day10.homework.two.d.array;

public class SumOfAllMainDiagonalElementsInSquareMatrix {
//	You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
//	Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, -2, -3 }, { -4, 5, -6 }, { -7, -8, 9 } };
		int sum = solve(arr);
		System.out.println(sum);
		// 15
	}

	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public static int solve(final int[][] A) {
		int rowSize = A.length;
		int colSize = A[0].length;
		int sum = 0;
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				if (i == j) {
					sum = sum + A[i][j];
				}
			}
		}
		return sum;
	}
}
// R=3 C=3
//1  -2 -3
//-4  5  -6
//-7 -8 9

//Input Format
//
//There are 1 lines in the input. First 2 integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array A.
//
//
//
//Output Format
//
//Return an integer denoting the sum of main diagonal elements.
//
//
//
//Example Input
//
//Input 1:
//
//3 3 1 -2 -3 -4 5 -6 -7 -8 9
//
//Input 2:
//
//2 2 3 2 2 3
//
//
//
//Example Output
//
//Output 1:
//
// 15 
//
//Output 2:
//
// 6 
//
//
//
//Example Explanation
//
//Explanation 1:
//
//The size of matrix is 3.
//So, considering the indexing from 0.
//Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
//A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
//
//Explanation 2:
//
//The size of matrix is 2.
//So, considering the indexing from 0.
//Main diagonal elements will be A[0][0] and A[1][1].
//A[1][1] + A[2][2] = 3 + 3 = 6
