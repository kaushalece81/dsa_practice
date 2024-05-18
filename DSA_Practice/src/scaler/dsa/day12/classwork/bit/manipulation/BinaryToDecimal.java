package scaler.dsa.day12.classwork.bit.manipulation;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int n = 10101101;  //1011
		int ans = 0; 
		int multiplier = 1;
		while (n > 0) {
			int remainder = n % 10;
			n = n / 10;
			ans = ans + remainder*multiplier;
			multiplier = multiplier*2 ;
		}
		System.out.print(ans);
	}
}