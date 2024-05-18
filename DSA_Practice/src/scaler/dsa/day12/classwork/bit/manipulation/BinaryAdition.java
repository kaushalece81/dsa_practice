package scaler.dsa.day12.classwork.bit.manipulation;

public class BinaryAdition {

	public static void main(String[] args) {
//		int n1 = 10110;
//		int n2 = 10011;
		
		int n1 = 1001011;
		int n2 = 11001001;
		int ans = 0, mul = 1, carry = 0;
		while (n1 > 0 || n2 > 0 || carry > 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;

			int sum = d1 + d2 + carry;
			int rem = sum % 2;
			carry = sum / 2;

			ans = ans + rem * mul;
			mul = mul * 10;
		}
		System.out.print(ans); //100010100

	}

}
