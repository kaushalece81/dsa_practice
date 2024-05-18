package scaler.day6.classwork.arrays.rotate.ktimes;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr =new int [] {3,1,6,2,5,4, 7};
		System.out.println("Before reverse");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ ", ");
		}
		
		int [] revArr =reverse(arr);
		System.out.println("After reverse");
		for(int i=0;i<arr.length;i++) {
			System.out.print(revArr[i]+ ", ");
		}
	}

	private static int[] reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
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
