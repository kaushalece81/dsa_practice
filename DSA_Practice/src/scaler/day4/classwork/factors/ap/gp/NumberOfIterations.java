package scaler.day4.classwork.factors.ap.gp;

public class NumberOfIterations {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		for (int i = 0; i < n; i++) {

		    for (int j = 0; j <= i; j++) {

		       // print(i + j);
		        count++;
		    }
		}
		System.out.println(count);
		
		
		
		int count2 =0;
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
		    ans += i * i;
		    count2++;
		}
		System.out.println(count2);

	}

}
