package scaler.dsa.day10.homework.two.d.array;

import java.util.Arrays;

public class RowSum {
	//Q4. Row Sum

	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,5,8},
			{4,3,1},
			{6,5,2}
			};
			System.out.print("Row sum = ");
			int[] solve = solve(arr);
			System.out.println(Arrays.toString(solve));

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


