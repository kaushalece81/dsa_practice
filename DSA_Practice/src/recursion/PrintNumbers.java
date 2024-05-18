package recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		int n=1;
		print(n);
	}

	private static void print(int n) {
		System.out.println(n);
		//base condition
		if(n==5) {
			return;
		}
		print(n+1);
	}

}
