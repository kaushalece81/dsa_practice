package scaler.dsa.day10.homework.two.d.array;

import java.util.Arrays;

public class ConvertToTranspose2DMatrix {
//	Given a 2D integer array A, return the transpose of A.
//	The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
	// A[i][j] changes to AT[j][i]
	// that means i > j below the digonal element which means j<i
	//this rule applicable for square matrix else will not work
	//note column becomes row and row becomes column
	public static void main(String[] args) {
//		int arr[][]=new int[][] {
//			{1,2,3},
//			{4,5,6},
//			{7,8,9}
//			};
		
//		int arr[][]=new int[][] {
//			{1,2,3,3},
//			{4,5,6,6},
//			{7,8,9,9}
//			};
		
		int arr[][]=new int[][] {
			{21, 62, 16, 44, 55, 100, 16,86,29}, 
			{62, 72, 85, 35, 14, 1, 89, 15, 73}, 
			{42, 44, 30, 56, 25, 52, 61, 23, 54}, 
			{5, 35, 12, 35, 55, 74, 50, 50, 80}, 
			{2, 65, 65, 82, 26, 36, 66, 60, 1}, 
			{18, 1, 16, 91, 42, 11, 72, 97, 35}, 
			{23, 57, 9, 28, 13, 44, 40, 47, 98}, 
			};
		
//			int arr[][]=new int[][] {
//			{21 ,62 ,42, 5, 2 ,18 ,23 } ,
//			{62, 72 ,44 ,35, 65, 1 ,57 },
//			{16, 85, 30 ,12, 65, 16, 9 },
//			{44, 35, 56, 35, 82, 91, 28 },
//			{55, 14, 25, 55 ,26, 42 ,13 } ,
//			{100 ,1 ,52 ,74, 36, 11, 44 } ,
//			{16 ,89 ,61 ,50 ,66, 72, 40 } ,
//			{86, 15, 23 ,50 ,60 ,97, 47 } ,
//			{29 ,73 ,54, 80, 1 ,35, 98 } 
//			};
		
//			failing 
//			[21 62 42 5 2 18 23 ] 
//			[62 72 44 35 65 1 57 ]
//			[16 85 30 12 65 16 9 ]
//			[44 35 56 35 82 91 28 ] 
//			[55 14 25 55 26 42 13 ] 
//			[100 1 52 74 36 11 44 ] 
//			[16 89 61 50 66 72 40 ] 
//			[86 15 23 50 60 97 47 ] 
//			[29 73 54 80 1 35 98 ] 
			System.out.print("Original matrix = ");
			System.out.println(Arrays.deepToString(arr));
			System.out.print("After transpose = ");
			
			int[][] arrTranspose=solve(arr);
			System.out.println(Arrays.deepToString(arrTranspose));

	}
	// all elements below diagonal should be swapped   ie. lower left triangle  
	//if we swap above and below diagonal both then it will return same matrix
	//this rule applicable for square matrix else will not work  since its non squre matrix we we cannot apply diagonal rules here
    public static int[][] solve(int[][] A) {
        int rowSize=A.length;
        int colSize=A[0].length;
        int[][] arrTranspose=new int [colSize][rowSize];
        
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				arrTranspose[j][i]=A[i][j];
			}
		}
		return arrTranspose;
    }
}

//int transpose[][]=new int[colSize][rowSize];
//for (int i = 0; i < rowSize; i++) {
//    for (int j = 0; j < colSize; j++) {
//    	transpose[i][j]=A[j][i];
//    }
//}

//Input Format
//
//First argument is a 2D matrix of integers.
//
//
//
//Output Format
//
//You have to return the Transpose of this 2D matrix.
//
//
//
//Example Input
//
//Input 1:
//
//A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//
//Input 2:
//
//A = [[1, 2],[1, 2],[1, 2]]
//
//
//
//Example Output
//
//Output 1:
//
//[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
//
//Output 2:
//
//[[1, 1, 1], [2, 2, 2]]
//
//
//
//Example Explanation
//
//Explanation 1:
//
//Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
// we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
//
//Explanation 2:
//
//After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]


