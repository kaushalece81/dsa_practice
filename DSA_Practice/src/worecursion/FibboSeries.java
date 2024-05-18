package worecursion;

public class FibboSeries {

	public static void main(String[] args) {
		int a0=0;
		int a1=1;
		int sum=a0;
		for(int i=0; i<10;i++) {
			System.out.println(sum+", ");
			a0=a1; // 0 1
			a1=sum;// 1 1
			sum=a0+a1; //0  1  2
		}

	}

}
