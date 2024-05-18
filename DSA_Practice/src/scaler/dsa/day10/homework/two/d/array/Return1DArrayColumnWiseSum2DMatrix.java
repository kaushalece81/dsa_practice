package scaler.dsa.day10.homework.two.d.array;

import java.util.Arrays;

public class Return1DArrayColumnWiseSum2DMatrix {
//	You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
	
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
        int arr[]=new int[colSize];
        for(int j=0;j<colSize;j++){
            int sum=0;
             for(int i=0;i<rowSize;i++){
                 sum=sum+A[i][j];
             }
             arr[j]=sum;

        }
        return arr;
    }
}

//Input Format
//
//First argument is a 2D array of integers.(2D matrix).
//
//
//
//Output Format
//
//Return an array containing column-wise sums of original matrix.
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
//{15,10,13,16}
//
//
//
//Example Explanation
//
//Explanation 1
//
//Column 1 = 1+5+9 = 15
//Column 2 = 2+6+2 = 10
//Column 3 = 3+7+3 = 13
//Column 4 = 4+8+4 = 16


