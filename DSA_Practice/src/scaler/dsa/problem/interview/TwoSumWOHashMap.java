package scaler.dsa.problem.interview;

/*
 * 
 * 
 */
public class TwoSumWOHashMap {

	public static void main(String[] args) {
		int N=5;
		int arr[] = {7,6,3,8,2};
		int target = 14;
		//sample output 1 3
		StringBuilder sb=twoSum(arr, target);
		System.out.println(sb.toString());

	}

	private static StringBuilder twoSum(int[] arr, int target) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {  // [0,N-1]  N
			int searchElement=target-arr[i];
			for(int j=i+1;j<arr.length;j++) {  //  [1,N-2]  N-2--> (N-2)(N-2+1)/2=(N-2)(N-1)/2=O(N^2)
				if(searchElement==arr[j]) {
					sb.append("i="+i+", j="+j);
				}
			}
		}
		return sb;
		
	}

}
