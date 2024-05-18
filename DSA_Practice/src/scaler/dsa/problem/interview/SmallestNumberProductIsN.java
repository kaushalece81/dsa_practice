package scaler.dsa.problem.interview;

public class SmallestNumberProductIsN {

	public static void main(String[] args) {
		int N=1000;
		int smallestNumber = smallestNumber(N);
		System.out.println(smallestNumber);

	}

	private static int smallestNumber(int N) {
		String ans="";
		for(int div=9;div>1;div--) {
			while(N%div==0) {
				N=N/div;
				ans=div+ans;
			}
		}
		if(N!=1) {
			return -1;
		}else {
			return Integer.parseInt(ans);
		}
	}

}
