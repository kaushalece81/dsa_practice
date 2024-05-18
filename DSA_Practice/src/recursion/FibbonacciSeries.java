package recursion;

public class FibbonacciSeries {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fibbo(i));
		}
	}

	public static int fibbo(int n) {
		//base condition n(0)=0 and n(1) =1
//		if (n == 0) {
//			return 0;
//		}
//		if(n==1) {
//			return 1;
//		}
		
		//OR 
		
		if (n <= 1) {
			return n;
		}
		return fibbo(n - 1) + fibbo(n - 2);
	}
}
