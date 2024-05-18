package geek.mathematics;

public class FibbonacciUsingRecursionSeries {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.print(fibbo(i)+ " ");
		}
	}
	private static int fibbo(int n) {
		if(n<=1) {
			return n;
		}
		return fibbo(n-1)+fibbo(n-2);
	}

}
