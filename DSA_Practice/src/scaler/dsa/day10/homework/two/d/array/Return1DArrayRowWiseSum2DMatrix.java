package scaler.dsa.day10.homework.two.d.array;

import java.util.Arrays;

public class Return1DArrayRowWiseSum2DMatrix {
//	You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
	
	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,2,3,4}
			};
			int[] ar=solve(arr);
			System.out.println(Arrays.toString(ar));
			//[15, 10, 13, 16]
	}
    public static int[] solve(int[][] A) {
        int rowSize=A.length;
        int colSize=A[0].length;
        int arr[]=new int[rowSize];
        for(int i=0;i<rowSize;i++){
            int sum=0;
            for(int j=0;j<colSize;j++){
                 sum=sum+A[i][j];
             }
             arr[i]=sum;

        }
        return arr;
    }
}

//Input Format
//
//First argument A is a 2D array of integers.(2D matrix).
//
//
//
//Output Format
//
//Return an array containing row-wise sums of original matrix.
//
//
//
//Example Input
//
//Input 1:
//
//[1,2,3,4]
//[5,6,7,8]
//[9,2,3,4]
//
//
//
//Example Output
//
//Output 1:
//
//[10,26,18]
//
//
//
//Example Explanation
//
//Explanation 1
//
//Row 1 = 1+2+3+4 = 10
//Row 2 = 5+6+7+8 = 26
//Row 3 = 9+2+3+4 = 18


