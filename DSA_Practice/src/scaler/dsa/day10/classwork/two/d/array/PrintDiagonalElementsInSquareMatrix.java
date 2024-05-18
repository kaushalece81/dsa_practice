package scaler.dsa.day10.classwork.two.d.array;

public class PrintDiagonalElementsInSquareMatrix {

	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,5,8},
			{4,3,1},
			{6,5,2}
			};
			System.out.print("Diagonal elements = ");
			int sum=solve(arr);

	}

	private static int solve(int[][] arr) {
		int rowSize=arr.length;
		int colSize=arr[0].length;
		for(int i=0;i<rowSize;i++) {			
			for(int j=0;j<colSize;j++) {
				if(i==j) {
					System.out.print(arr[i][j]+" "); 
				}
			}
		}
		return 0;
	}
	//Diagonal elements = 1 3 2 

}
