package scaler.dsa.day21.classwork.recursion1;

public class SumOfFirstNNaturalNumber1 {


	public static void main(String[] args) {
		int n=4;
		int sum=sum(n);
		System.out.println(sum);
	}
	private static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}

}


