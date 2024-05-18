package scaler.dsa.day10.classwork.two.d.array;

public class PrintColumnWiseSum2DMatrix {

	public static void main(String[] args) {
		int arr[][]=new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
			};
			int sum=solve(arr);
			//System.out.println("sum="+sum);

	}

	private static int solve(int arr[][]) {
		int rowSize=arr.length;
		int colSize=arr[0].length;
		for (int j = 0; j < colSize; j++) {
			int sum = 0;
			for (int i = 0; i < rowSize; i++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Column wise sum=" + sum);
		}
			
		return 0;
	}
	
//	Column wise sum=15
//	Column wise sum=18
//	Column wise sum=21
//	Column wise sum=24

}
