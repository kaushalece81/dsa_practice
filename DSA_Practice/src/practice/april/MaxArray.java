package practice.april;

public class MaxArray {

	public static void main(String[] args) {
		int [] arr=new int[] {5,6,9,2,1,0,10};
		int max=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]> max) {
			max=arr[i];
			}
		}
		System.out.println("max::"+max);

	}

}
