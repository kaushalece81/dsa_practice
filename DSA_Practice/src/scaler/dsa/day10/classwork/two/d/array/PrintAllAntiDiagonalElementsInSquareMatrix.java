package scaler.dsa.day10.classwork.two.d.array;

public class PrintAllAntiDiagonalElementsInSquareMatrix {


	
	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
			};
			System.out.print("All Anti Diagonal elements = ");
			solve(arr);

	}

	private static void solve(int[][] arr) {
		int rowSize=arr.length;
		int colSize=arr[0].length;
		for (int c = 0; c < colSize; c++) {
			int i=0;
			int j=c;
			while (i < rowSize && j>=0) {
				System.out.print(arr[i][j] + " ");
				i++;
				j--;
			}
			System.out.println();
		}
		
		for (int r = 1; r < rowSize; r++) {
			int i=r;
			int j=colSize-1;
			while (i < rowSize && j>=0) {
				System.out.print(arr[i][j] + " ");
				i++;
				j--;
			}
			System.out.println();
		}
	}

}
