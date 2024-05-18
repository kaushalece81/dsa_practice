package scaler.dsa.day10.homework.two.d.array;
public class MinorDiagonalElemenstSum {
//	You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
//
//	Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1, -2, -3},
			{-4, 5, -6},
			{-7, -8, 9} 
			};
		int sum=solve(arr);
		System.out.println(sum);
	}
    public static int solve(final int[][] A) {
        int rowSize=A.length;
        int colSize=A[0].length;
        int i=0;
        int j= colSize-1;
        int sum=0;
        while(i<rowSize){
            sum=sum+A[i][j];
            i++;
            j--;
        }
        return sum;
    }
}

//Example Input
//
//Input 1:
//
// A = [[1, -2, -3],
//      [-4, 5, -6],
//      [-7, -8, 9]]
//
//Input 2:
//
// A = [[3, 2],
//      [2, 3]]
//
//
//
//Example Output
//
//Output 1:
//
// -5 
//
//Output 2:
//
// 4 
//
//
//
//Example Explanation
//
//Explanation 1:
//
// A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
//
//Explanation 2:
//
// A[1][2] + A[2][1] = 2 + 2 = 4


