package scaler.dsa.day8.classwork.carryForward;

public class PrintLengthOfSmallestSubarrayContainingMinMaxOfArray {
//bruit force 
	public static void main(String[] args) {
		int [] arr=new int[] {2,2,6,4,5,1,5,2,6,4,1};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		int length= arr.length;
		int minLength=Integer.MAX_VALUE;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				for(int k=i;k<=j;k++) {
					if((arr[k]==min && arr[j]==max) ||(arr[k]==max && arr[j]==min) ) {
						int subArrayLengthWithMinMax=(j-k)+1;// one need to add to get correct length
						if(subArrayLengthWithMinMax < minLength) {
							minLength=subArrayLengthWithMinMax;
						}
					}

				}
			}
			
		}
		System.out.println("minLength="+minLength);

	}

}
