package scaler.dsa.day13.homework.string;

import java.util.Arrays;

public class RowToColumnZero {
//	You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
//			Problem Constraints
//
//			1 <= A.size() <= 103
//
//			1 <= A[i].size() <= 103
//
//			0 <= A[i][j] <= 103
//
//
//
//			Input Format
//
//			First argument is a 2D integer matrix A.
//
//
//
//			Output Format
//
//			Return a 2D matrix after doing required operations.


	public static void main(String[] args) {
		int A[][]=new int [][] {
			{1,2,3,4},
			{5,6,7,0},
			{9,2,0,4}
		};
		int[][] ans = solve(A);
		System.out.println(Arrays.deepToString(ans));

	}
	
	 public static int[][] solve(int[][] A) {
		 int rowSize=A.length;
		 int colSize=A[0].length;
		 for(int i=0;i<rowSize;i++) {
			 boolean flag=false;
			 for(int j=0;j<colSize;j++) {
				 if(A[i][j]==0) {
					 flag=true;
				 }
			 } 
			 // all column having other than zero set to -1
			 if(flag==true) {
				 for(int j=0;j<colSize;j++) {
					 if(A[i][j]!=0) {
						 A[i][j]=-1;
					 }
				 }  
			 } 
		 }
		 
		 
		 for(int j=0;j<colSize;j++) {
			 boolean flag=false;
			 for(int i=0;i<rowSize;i++) {			
				 if(A[i][j]==0) {
					 flag=true;
				 }
			 } 
			 // all rows having other than zero set to -1
			 if(flag==true) {
				 for(int i=0;i<rowSize;i++) {
					 if(A[i][j]!=0) {
						 A[i][j]=-1;
					 }
				 }  
			 } 
		 }
		 
		 // now change all -1 values to 0
		 for(int i=0;i<rowSize;i++) {
			 boolean flag=false;
			 for(int j=0;j<colSize;j++) {
				 if(A[i][j]==-1) {
					 A[i][j]=0;
				 }
			 } 
		 }
		 return A;
	    }

}

//Example Input
//
//Input 1:
//
//[1,2,3,4]
//[5,6,7,0]
//[9,2,0,4]
//
//
//
//Example Output
//
//Output 1:
//
//[1,2,0,0]
//[0,0,0,0]
//[0,0,0,0]
//
//
//
//Example Explanation
//
//Explanation 1:
//
//A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
