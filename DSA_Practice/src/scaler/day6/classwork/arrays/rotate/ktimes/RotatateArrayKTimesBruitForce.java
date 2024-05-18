package scaler.day6.classwork.arrays.rotate.ktimes;

public class RotatateArrayKTimesBruitForce {
	
	public static void main(String[] args) {
		int [] arr =new int [] {3,1,6,2,5,4, 7};
		System.out.println("Before rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ ", ");
		}
		
		int [] rotatedArr =rotateArrayKTimes(arr, arr.length, 2);
		System.out.println("After rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(rotatedArr[i]+ ", ");
		}
	}
//bruit force approach start from last and move one place to right
	private static int[] rotateArrayKTimes(int[] arr,int n,int k) {
		// loop to rotate k times
		for(int i=0;i<k;i++) {
			// code to shift to right by one element
			int temp= arr[n-1];
			for(int j=n-1; j>=1;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		
		return arr;
	}


}
