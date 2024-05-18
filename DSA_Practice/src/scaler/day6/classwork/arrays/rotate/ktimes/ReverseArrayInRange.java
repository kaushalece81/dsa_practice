package scaler.day6.classwork.arrays.rotate.ktimes;

public class ReverseArrayInRange {

	public static void main(String[] args) {
		int [] arr =new int [] {3,1,6,2,5,4, 7};
		System.out.println("Before reverse");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ ", ");
		}
		
		int [] revArr =reverseInRange(arr, arr.length,1, 3);
		System.out.println("After reverse");
		for(int i=0;i<arr.length;i++) {
			System.out.print(revArr[i]+ ", ");
		}
	}

	private static int[] reverseInRange(int[] arr,int n, int l , int r) {
		int i=l;
		int j=r;
		while(i<j) {
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}

}
