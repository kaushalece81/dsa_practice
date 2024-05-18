package scaler.dsa.day9.classwork.sliding.contribution;

public class PrintAlLIndexesOfSubArrayOfLengthK {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		int k=3;
		int len=arr.length;
		usingWhile(k, len);
		//OR
		usingForLoop(k, len);
	}
	
	private static void usingForLoop(int k, int len) {
		System.out.println("using For");
		for(int i=0;i<len-k;i++ ) {
			int j=i+k-1;
			System.out.println("i="+i+" ,j="+j);
		}
	}
	//easy
	private static void usingWhile(int k, int len) {
		System.out.println("using While");
		int i=0;
		int j=k-1;
		while(j<len) {
			System.out.println("i="+i+" ,j="+j);
			i++;
			j++;
		}
	}

}
