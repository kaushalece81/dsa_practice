package scaler.dsa.day10.classwork.two.d.array;

public class PrintAntiDiagonalElementsInSquareMatrix {

	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,5,8},
			{4,3,1},
			{6,5,2}
			};
			System.out.print("Anti Diagonal elements = ");
			int sum=solve(arr);

	}

	private static int solve(int[][] arr) {
		int rowSize=arr.length;
		int colSize=arr[0].length;
		int i=0;
		int j=colSize-1;
		while(i<rowSize) {
			System.out.print(arr[i][j]+" ");
			i++;
			j--;
		}
		return 0;
	}
	
	//Anti Diagonal elements = 8 3 6 

}
