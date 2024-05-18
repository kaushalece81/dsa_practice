package geek.mathematics;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n = 11;
		fibbo(n);
	}

	private static void fibbo(int n) {
		int prevNum=0;
		int nextNum=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(prevNum+ " ");
			int sum=prevNum+nextNum;
			prevNum=nextNum;
			nextNum=sum;
		}
	}

}
