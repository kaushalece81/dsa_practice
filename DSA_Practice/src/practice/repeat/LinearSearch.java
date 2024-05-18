package practice.repeat;

public class LinearSearch {

	public static void main(String[] args) {

		int [] arr=new int[] {1,6,2,10,6,9};
		int target=19;
		int index=linearSearch(arr,target);
		System.out.println("index:"+index);
		

	}

	private static int linearSearch(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
