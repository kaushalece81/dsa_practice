package scaler.day6.classwork.arrays.rotate.ktimes;

public class RotatateArrayKTimesOptimized {

	// if k>=n then k=k%n
		public static void main(String[] args) {
			int [] arr =new int [] {3,1,6,2,5,4, 7};
			//o/p  5,4,7,3,1,6,2
			System.out.println("Before rotation");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ ", ");
			}
			
			int [] rotatedArr =rotateArrayKTimes(arr, arr.length, 3);
			System.out.println("After rotation");
			for(int i=0;i<arr.length;i++) {
				System.out.print(rotatedArr[i]+ ", ");
			}
		}

		private static int[] rotateArrayKTimes(int[] arr,int n,int k) {
			//first reverse the whole array
			int i=0;
			int j=n-1;
			reverseArrayInRange(arr, n,i,j);
			// now reverse 0 to k-1
			reverseArrayInRange(arr, n,i,k-1);
			// now reverse K to n-1
			reverseArrayInRange(arr, n,k,n-1);
			return arr;
		}

		private static void reverseArrayInRange(int[] arr, int n, int l, int r) {
			int i=l;
			int j=r;
			while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}

}
